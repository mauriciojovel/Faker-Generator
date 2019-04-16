package faker.generator;

import static java.util.Arrays.*;

import com.github.javafaker.Faker;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;

/**
 * Class to create a new instance with dummy data.
 */
@Slf4j
public class FakerGen {

  private static final Faker faker;

  static {
    faker = Faker.instance();
  }

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
                Optional<Field> reference = Arrays.stream(ni.getClass().getDeclaredFields()).filter(field -> field.getType().isAssignableFrom(clazz)).findFirst();
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
            int endValue = fakeNewCollection.fixValue() == -1 ? faker.number().numberBetween(1, fakeNewCollection.maxValue()) : fakeNewCollection.fixValue();
            ArrayList<Object> arrayList = new ArrayList<>(endValue);
            for (int i = 0; i < endValue; i++) {
              Optional<?> d = create(fakeNewCollection.value());
              d.ifPresent(ni -> {
                if(fakeNewCollection.lookForReference()) {
                  Optional<Field> reference = Arrays.stream(ni.getClass().getDeclaredFields()).filter(field -> field.getType().isAssignableFrom(clazz)).findFirst();
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
          } else if (f.isAnnotationPresent(FakeAncient.class)) {
            FakeAncient fakeAncient = f.getAnnotation(FakeAncient.class);
            switch (fakeAncient.value()) {
              case GOD:
                f.set(data, faker.ancient().god());
                break;
              case HERO:
                f.set(data, faker.ancient().hero());
                break;
              case TITAN:
                f.set(data, faker.ancient().titan());
                break;
              case PRIMORDIAL:
                f.set(data, faker.ancient().primordial());
                break;
            }
          } else if(f.isAnnotationPresent(FakeName.class)) {
            FakeName fname = f.getAnnotation(FakeName.class);
            switch (fname.value()) {
              case NAME:
                f.set(data, faker.name().name());
                break;
              case TITLE:
                f.set(data, faker.name().title());
                break;
              case PREFIX:
                f.set(data, faker.name().prefix());
                break;
              case SUFFIX:
                f.set(data, faker.name().suffix());
                break;
              case FULL_NAME:
                f.set(data, faker.name().fullName());
                break;
              case LAST_NAME:
                f.set(data, faker.name().lastName());
                break;
              case FIRST_NAME:
                f.set(data, faker.name().firstName());
                break;
              case NAME_WITH_MIDDLE:
                f.set(data, faker.name().nameWithMiddle());
                break;
            }
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
