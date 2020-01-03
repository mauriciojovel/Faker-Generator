package faker.generator;

import com.github.javafaker.Faker;
import faker.generator.services.FakeServiceName;
import lombok.extern.slf4j.Slf4j;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Optional;

import static java.util.Arrays.asList;

/**
 * Class to create a new instance with dummy data.
 */
@Slf4j
@SuppressWarnings("WeakerAccess")
public class FakerGen {

  private static Faker faker;

  static {
    faker = Faker.instance();
  }

  @SuppressWarnings("WeakerAccess")
  public static void changeLanguage(Locale locale) {
    faker = Faker.instance(locale);
  }

  @SuppressWarnings("WeakerAccess")
  public static <T> Optional<T> create(Class<T> clazz) {
    try {
      T data = clazz.newInstance();
      Field[] fields = clazz.getDeclaredFields();
      asList(fields).forEach(f -> {
        try {
          f.setAccessible(true);
          if(f.isAnnotationPresent(FakeNewInstance.class)) {
            Optional<?> newInstance = create(f.getType());
            newInstance.ifPresent(ni -> {
              FakeNewInstance fnewInstance = f.getAnnotation(FakeNewInstance.class);
              if(fnewInstance.lookForReference()) {
                Optional<Field> reference = Arrays.stream(ni.getClass().getDeclaredFields()).
                        filter(field -> field.getType().isAssignableFrom(clazz)).findFirst();
                reference.ifPresent(field -> {
                  try {
                    field.setAccessible(true);
                    field.set(ni, data);
                  } catch (IllegalAccessException e) {
                    log.debug("Exception when we tried to do something crazy", e);
                  }
                });
              }
            });

            f.set(data, newInstance.orElse(null));
          } else if(f.isAnnotationPresent(FakeNewCollection.class)) {
            FakeNewCollection fakeNewCollection = f.getAnnotation(FakeNewCollection.class);
            int endValue = fakeNewCollection.fixValue() == -1 ? faker.number().
                    numberBetween(1, fakeNewCollection.maxValue()) : fakeNewCollection.fixValue();
            ArrayList<Object> arrayList = new ArrayList<>(endValue);
            for (int i = 0; i < endValue; i++) {
              Optional<?> d = create(fakeNewCollection.value());
              d.ifPresent(ni -> {
                if(fakeNewCollection.lookForReference()) {
                  Optional<Field> reference = Arrays.stream(ni.getClass().getDeclaredFields()).
                          filter(field -> field.getType().isAssignableFrom(clazz)).findFirst();
                  reference.ifPresent(field -> {
                    try {
                      field.setAccessible(true);
                      field.set(ni, data);
                    } catch (IllegalAccessException e) {
                      log.debug("Exception when we tried to do something crazy", e);
                    }
                  });
                }
                arrayList.add(ni);
              });

            }
            f.set(data, arrayList);
          } else {
            Optional<Annotation> an = Arrays.stream(f.getDeclaredAnnotations()).
                    filter(a -> a.annotationType().isAnnotationPresent(FakeServiceName.class)).findFirst();
            an.ifPresent(a -> {
              FakeServiceName fsn = a.annotationType().getAnnotation(FakeServiceName.class);
              try {
                //noinspection unchecked
                fsn.value().newInstance().setValue(a, f, data, faker);
              } catch (InstantiationException | IllegalAccessException e) {
                log.debug("Problem with create a new instance of {}", fsn.value(), e);
              }
            });
          }
        } catch (IllegalAccessException e) {
          log.debug("Exception when we tried to do something crazy", e);
        }

      });
      return Optional.of(data);
    } catch (InstantiationException | IllegalAccessException e) {
      log.debug("Exception when we tried to do something crazy", e);
    }
    return Optional.empty();
  }
}
