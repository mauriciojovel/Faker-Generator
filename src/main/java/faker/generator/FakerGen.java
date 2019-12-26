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
          else if(f.isAnnotationPresent(FakeWeather.class)) {
            FakeWeather fc = f.getAnnotation(FakeWeather.class);
            switch (fc.value()) {
              case DESCRIPTION:
                f.set(data, faker.weather().description());
                break;
              case CELSIUS:
                f.set(data, faker.weather().temperatureCelsius());
                break;
              case FAHRENHEIT:
                f.set(data, faker.weather().temperatureFahrenheit());
                break;
            }
          }
          else if(f.isAnnotationPresent(FakeStarTrek.class)) {
            FakeStarTrek fc = f.getAnnotation(FakeStarTrek.class);
            switch (fc.value()) {
              case CHARACTER:
                f.set(data, faker.starTrek().character());
                break;
              case LOCATION:
                f.set(data, faker.starTrek().location());
                break;
              case SPECIE:
                f.set(data, faker.starTrek().specie());
                break;
              case VILLAIN:
                f.set(data, faker.starTrek().villain());
            }
          }
          else if(f.isAnnotationPresent(FakeOverwatch.class)) {
            FakeOverwatch fc = f.getAnnotation(FakeOverwatch.class);
            switch (fc.value()) {
              case HERO:
                f.set(data, faker.overwatch().hero());
                break;
              case LOCATION:
                f.set(data, faker.overwatch().location());
                break;
              case QUOTE:
                f.set(data, faker.overwatch().quote());
                break;
            }
          }
          else if(f.isAnnotationPresent(FakeLeagueOfLegends.class)) {
            FakeLeagueOfLegends fc = f.getAnnotation(FakeLeagueOfLegends.class);
            switch (fc.value()) {
              case CHAMPION:
                f.set(data, faker.leagueOfLegends().champion());
                break;
              case LOCATION:
                f.set(data, faker.leagueOfLegends().location());
                break;
              case MASTERIES:
                f.set(data, faker.leagueOfLegends().masteries());
                break;
              case QUOTE:
                f.set(data, faker.leagueOfLegends().quote());
                break;
              case RANK:
                f.set(data, faker.leagueOfLegends().rank());
                break;
              case SUMMONERSPELL:
                f.set(data,faker.leagueOfLegends().summonerSpell());
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
