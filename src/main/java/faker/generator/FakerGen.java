package faker.generator;

import static java.util.Arrays.*;

import com.github.javafaker.Faker;
import java.lang.reflect.Field;
import java.util.*;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

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
//            FakeAvatar fakeAvatar = f.getAnnotation(FakeAvatar.class);
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
          } else if (f.isAnnotationPresent(FakeInternet.class)) {
            FakeInternet fakeInternet = f.getAnnotation(FakeInternet.class);
            switch (fakeInternet.value()) {
              case EMAIL:
                if(StringUtils.isEmpty(fakeInternet.localPart())) {
                  if(fakeInternet.isEmailSafe()) {
                    f.set(data, faker.internet().safeEmailAddress());
                  } else {
                    f.set(data, faker.internet().emailAddress());
                  }
                } else {
                  if(fakeInternet.isEmailSafe()) {
                    f.set(data, faker.internet().safeEmailAddress(fakeInternet.localPart()));
                  } else {
                    f.set(data, faker.internet().emailAddress(fakeInternet.localPart()));
                  }
                }
                break;
              case DOMAIN_NAME:
                f.set(data, faker.internet().domainName());
                break;
              case DOMAIN_WORD:
                f.set(data, faker.internet().domainWord());
                break;
              case DOMAIN_SUFFIX:
                f.set(data, faker.internet().domainSuffix());
                break;
              case URL:
                f.set(data, faker.internet().url());
                break;
              case AVATAR:
                f.set(data, faker.internet().avatar());
                break;
              case IMAGE:
                if(fakeInternet.imageWidth() > 0 && fakeInternet.imageHeight() > 0 ) {
                  f.set(data, faker.internet().image(fakeInternet.imageWidth(), fakeInternet.imageHeight(),
                          fakeInternet.isImageGray(), fakeInternet.imageText()));
                } else {
                  f.set(data, faker.internet().image());
                }
                break;
              case PASSWORD:
                f.set(data, faker.internet().password(fakeInternet.passwordMin(), fakeInternet.passwordMax(),
                        fakeInternet.passwordIncludeUppercase(), fakeInternet.passwordIncludeSpecialCharacters()));
                break;
              case MAC_ADDRESS:
                f.set(data, faker.internet().macAddress(fakeInternet.macAddressPrefix()));
                break;
              case IPV4:
                f.set(data, faker.internet().ipV4Address());
                break;
              case PRIVATE_IPV4:
                f.set(data, faker.internet().privateIpV4Address());
                break;
              case PUBLIC_IPV4:
                f.set(data, faker.internet().publicIpV4Address());
                break;
              case IPV4_CIDR:
                f.set(data, faker.internet().ipV4Cidr());
                break;
              case IPV6:
                f.set(data, faker.internet().ipV6Address());
                break;
              case IPV6_CIDR:
                f.set(data, faker.internet().ipV6Cidr());
                break;
              case SLUG:
                f.set(data, faker.internet().slug(fakeInternet.slugWords().length == 0 ? null :
                        Arrays.asList(fakeInternet.slugWords()), fakeInternet.slugSeparator()));
                break;
              case UUID:
                f.set(data, faker.internet().uuid());
                break;
            }
          } else if (f.isAnnotationPresent(FakePhoneNumber.class)) {
            FakePhoneNumber fn = f.getAnnotation(FakePhoneNumber.class);
            f.set(data, faker.numerify(faker.resolve(fn.value().getFakerKey())));
          } else if (f.isAnnotationPresent(FakePokemon.class)) {
            FakePokemon po = f.getAnnotation(FakePokemon.class);
            f.set(data, faker.resolve(po.value().getFakerKey()));
          } else if (f.isAnnotationPresent(FakeAddress.class)) {
            FakeAddress add = f.getAnnotation(FakeAddress.class);
            switch (add.value()) {
              case STREET_NAME:
                f.set(data, faker.address().streetName());
                break;
              case SECONDARY_ADDRESS:
                f.set(data, faker.address().secondaryAddress());
                break;
              case ZIP_CODE:
                f.set(data, faker.address().zipCode());
                break;
              case STREET_SUFFIX:
                f.set(data, faker.address().streetSuffix());
                break;
              case STREET_PREFIX:
                f.set(data, faker.address().streetPrefix());
                break;
              case CITY_SUFFIX:
                f.set(data, faker.address().citySuffix());
                break;
              case CITY_PREFIX:
                f.set(data, faker.address().cityPrefix());
                break;
              case CITY:
                f.set(data, faker.address().city());
                break;
              case CITY_NAME:
                f.set(data, faker.address().cityName());
                break;
              case STATE:
                f.set(data, faker.address().state());
                break;
              case STATE_ABBR:
                f.set(data, faker.address().stateAbbr());
                break;
              case TIME_ZONE:
                f.set(data, faker.address().timeZone());
                break;
              case COUNTRY:
                f.set(data, faker.address().country());
                break;
              case COUNTRY_CODE:
                f.set(data, faker.address().countryCode());
                break;
              case FULL_ADDRESS:
                f.set(data, faker.address().fullAddress());
                break;
              case BUILDING_NUMBER:
                f.set(data, faker.address().buildingNumber());
                break;
              case STREET_ADDRESS_NUMBER:
                f.set(data, faker.address().streetAddressNumber());
                break;
              case STREET_ADDRESS:
                f.set(data, faker.address().streetAddress(add.includeSecondary()));
                break;
              case ZIP_CODE_BY_STATE:
                f.set(data, faker.address().zipCodeByState(add.stateAbbr()));
                break;
              case COUNTY_BY_ZIP_CODE:
                f.set(data, faker.address().countyByZipCode(add.postCode()));
                break;
              case LATITUDE:
                f.set(data, faker.address().latitude());
                break;
              case LONGITUDE:
                f.set(data, faker.address().longitude());
                break;
            }
          } else if (f.isAnnotationPresent(FakeBusiness.class)) {
            FakeBusiness b = f.getAnnotation(FakeBusiness.class);
            switch (b.value()) {
              case CREDIT_CARD_TYPE:
                f.set(data, faker.business().creditCardType());
                break;
              case CREDIT_CARD_EXPIRY:
                f.set(data, faker.business().creditCardExpiry());
                break;
              case CREDIT_CARD_NUMBER:
                f.set(data, faker.business().creditCardNumber());
                break;
            }
          } else if( f.isAnnotationPresent(FakeChuckNorris.class) ) {
            f.set(data, faker.chuckNorris().fact());
          } else if (f.isAnnotationPresent(FakeBook.class)) {
            FakeBook b = f.getAnnotation(FakeBook.class);
            switch (b.value()) {
              case GENRE:
                f.set(data, faker.book().genre());
                break;
              case TITLE:
                f.set(data, faker.book().title());
                break;
              case AUTHOR:
                f.set(data, faker.book().author());
                break;
              case PUBLISHER:
                f.set(data, faker.book().publisher());
                break;
            }
          } else if(f.isAnnotationPresent(FakeColor.class) ) {
            f.set(data, faker.color().name());
          }else if(f.isAnnotationPresent(FakeCommerce.class)) {
            FakeCommerce fc = f.getAnnotation(FakeCommerce.class);
            switch (fc.value()) {
              case COLOR:
                f.set(data, faker.commerce().color());
                break;
              case DEPARTMENT:
                f.set(data, faker.commerce().department());
                break;
              case PRODUCT_NAME:
                f.set(data, faker.commerce().productName());
                break;
              case MATERIAL:
                f.set(data, faker.commerce().material());
                break;
              case PRICE:
                f.set(data, faker.commerce().price());
                break;
              case PROMOTION_CODE:
                f.set(data, faker.commerce().promotionCode());
                break;
            }
          }
          else if (f.isAnnotationPresent(FakeMedical.class)) {
            FakeMedical b = f.getAnnotation(FakeMedical.class);
            switch (b.value()) {
              case MEDICINE:
                f.set(data, faker.medical().medicineName());
                break;
              case DISEASE:
                f.set(data, faker.medical().diseaseName());
                break;
              case HOSPITAL:
                f.set(data, faker.medical().hospitalName());
                break;
              case SYMPTOMS:
                f.set(data, faker.medical().symptoms());
            }
          }
          else if (f.isAnnotationPresent(FakeTeam.class)) {
            FakeTeam t = f.getAnnotation(FakeTeam.class);
            switch (t.value()) {
              case NAME:
                f.set(data, faker.team().name());
                break;
              case CREATURE:
                f.set(data, faker.team().creature());
                break;
              case STATE:
                f.set(data, faker.team().state());
                break;
              case SPORT:
                f.set(data, faker.team().sport());
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
