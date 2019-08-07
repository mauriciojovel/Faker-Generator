package faker.generator;

import static java.util.Arrays.*;

import com.github.javafaker.Faker;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;

/**
 * Class to create a new instance with dummy data.
 */
@Slf4j
public class FakerGen {

  private static Faker faker;

  static {
    faker = Faker.instance();
  }

  public static void changeLanguage(Locale locale) {
    faker = Faker.instance(locale);
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
            f.set(data, faker.resolve(fakeAncient.value().getFakerKey()));
          } else if (f.isAnnotationPresent(FakeApp.class)) {
            FakeApp fakeApp = f.getAnnotation(FakeApp.class);
            f.set(data, faker.resolve(fakeApp.value().getFakeKey()));
          } else if (f.isAnnotationPresent(FakeArtist.class)) {
            FakeArtist fakeArtist = f.getAnnotation(FakeArtist.class);
            f.set(data, faker.resolve(fakeArtist.value().getFakerKey()));
          } else if (f.isAnnotationPresent(FakeAvatar.class)) {
            FakeAvatar fakeAvatar = f.getAnnotation(FakeAvatar.class);
            f.set(data, faker.avatar().image());
          } else if(f.isAnnotationPresent(FakeName.class)) {
            FakeName fakerName = f.getAnnotation(FakeName.class);

            switch (fakerName.value()) {
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
              case USERNAME:
                f.set(data, faker.name().username());
                break;
            }
          } else if(f.isAnnotationPresent(FakeNumber.class)) {
            FakeNumber fakeNumber = f.getAnnotation(FakeNumber.class);
            switch (fakeNumber.value()) {
              case DIGIT:
                if(fakeNumber.count() > 0) {
                  f.set(data, faker.number().digits(fakeNumber.count()));

                } else {
                  f.set(data, faker.number().digit());
                }
                break;
              case NUMBER_BETWEEN:
                if(fakeNumber.minValue() >= 0 && fakeNumber.maxValue() >= 0) {
                  f.set(data, faker.number().numberBetween(fakeNumber.minValue(), fakeNumber.maxValue()));
                } else {
                  throw new IllegalArgumentException("You need set the values min value and max value to use this function");
                }
                break;
              case RANDOM_DIGIT:
                f.set(data, faker.number().randomDigit());
                break;
              case RANDOM_DIGIT_NON_ZERO:
                f.set(data, faker.number().randomDigitNotZero());
                break;
              case RANDOM_DOUBLE:
                if(fakeNumber.maxNumberOfDecimal() > -1 && fakeNumber.minValue() >= 0 && fakeNumber.maxValue() >= 0) {
                  f.set(data, faker.number().randomDouble(fakeNumber.maxNumberOfDecimal(), fakeNumber.minValue(), fakeNumber.maxValue()));
                } else {
                  throw new IllegalArgumentException("You need set the values, maxNumberOfDecimal, minValue and maxValue");
                }
                break;
              case RANDOM_NUMBER:
                if(fakeNumber.count() > 0) {
                  f.set(data, faker.number().randomNumber(fakeNumber.count(), fakeNumber.strict()));
                } else {
                  f.set(data, faker.number().randomNumber());
                }
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
