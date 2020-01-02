package faker.generator.services;

import com.github.javafaker.Faker;
import faker.generator.FakeAddress;

import java.lang.reflect.Field;

public class FakeAddressService implements FakeService<FakeAddress> {
    @Override
    public void setValue(FakeAddress annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        switch (annotation.value()) {
            case STREET_NAME:
                target.set(data, faker.address().streetName());
                break;
            case SECONDARY_ADDRESS:
                target.set(data, faker.address().secondaryAddress());
                break;
            case ZIP_CODE:
                target.set(data, faker.address().zipCode());
                break;
            case STREET_SUFFIX:
                target.set(data, faker.address().streetSuffix());
                break;
            case STREET_PREFIX:
                target.set(data, faker.address().streetPrefix());
                break;
            case CITY_SUFFIX:
                target.set(data, faker.address().citySuffix());
                break;
            case CITY_PREFIX:
                target.set(data, faker.address().cityPrefix());
                break;
            case CITY:
                target.set(data, faker.address().city());
                break;
            case CITY_NAME:
                target.set(data, faker.address().cityName());
                break;
            case STATE:
                target.set(data, faker.address().state());
                break;
            case STATE_ABBR:
                target.set(data, faker.address().stateAbbr());
                break;
            case TIME_ZONE:
                target.set(data, faker.address().timeZone());
                break;
            case COUNTRY:
                target.set(data, faker.address().country());
                break;
            case COUNTRY_CODE:
                target.set(data, faker.address().countryCode());
                break;
            case FULL_ADDRESS:
                target.set(data, faker.address().fullAddress());
                break;
            case BUILDING_NUMBER:
                target.set(data, faker.address().buildingNumber());
                break;
            case STREET_ADDRESS_NUMBER:
                target.set(data, faker.address().streetAddressNumber());
                break;
            case STREET_ADDRESS:
                target.set(data, faker.address().streetAddress(annotation.includeSecondary()));
                break;
            case ZIP_CODE_BY_STATE:
                target.set(data, faker.address().zipCodeByState(annotation.stateAbbr()));
                break;
            case COUNTY_BY_ZIP_CODE:
                target.set(data, faker.address().countyByZipCode(annotation.postCode()));
                break;
            case LATITUDE:
                target.set(data, faker.address().latitude());
                break;
            case LONGITUDE:
                target.set(data, faker.address().longitude());
                break;
        }
    }
}
