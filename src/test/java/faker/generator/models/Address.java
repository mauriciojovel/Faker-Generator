package faker.generator.models;

import faker.generator.FakeAddress;
import faker.generator.FakeAddressType;
import lombok.Data;

@Data
public class Address {
    @FakeAddress(FakeAddressType.STREET_NAME)
    private String streetName;

    @FakeAddress(value=FakeAddressType.SECONDARY_ADDRESS)
    private String secondaryAddress;

    @FakeAddress(value=FakeAddressType.ZIP_CODE)
    private String zipCode;

    @FakeAddress(value=FakeAddressType.STREET_SUFFIX)
    private String streetSuffix;

    @FakeAddress(value=FakeAddressType.STREET_PREFIX)
    private String streetPrefix;

    @FakeAddress(value=FakeAddressType.CITY_SUFFIX)
    private String citySuffix;

    @FakeAddress(value=FakeAddressType.CITY_PREFIX)
    private String cityPrefix;

    @FakeAddress(value=FakeAddressType.CITY)
    private String city;

    @FakeAddress(value=FakeAddressType.CITY_NAME)
    private String cityName;

    @FakeAddress(value=FakeAddressType.STATE)
    private String state;

    @FakeAddress(value=FakeAddressType.STATE_ABBR)
    private String stateAbbr;

    @FakeAddress(value=FakeAddressType.TIME_ZONE)
    private String timeZone;

    @FakeAddress(value=FakeAddressType.COUNTRY)
    private String county;

    @FakeAddress(value=FakeAddressType.COUNTRY_CODE)
    private String countryCode;

    @FakeAddress
    private String fullAddress;

    @FakeAddress(value=FakeAddressType.BUILDING_NUMBER)
    private String buildingNumber;

    @FakeAddress(value=FakeAddressType.STREET_ADDRESS_NUMBER)
    private String streetAddressNumber;

    @FakeAddress(value=FakeAddressType.STREET_ADDRESS, includeSecondary = true)
    private String streetAddressWithSecondary;

    @FakeAddress(value=FakeAddressType.STREET_ADDRESS)
    private String streetAddress;

    @FakeAddress(value=FakeAddressType.ZIP_CODE_BY_STATE, stateAbbr = "LA")
    private String zipCodeByState;

//    @FakeAddress(value=FakeAddressType.COUNTY_BY_ZIP_CODE, postCode = "72201")
//    private String countryByZipCode;

    @FakeAddress(value=FakeAddressType.LATITUDE)
    private String latitude;

    @FakeAddress(value=FakeAddressType.LONGITUDE)
    private String longitude;

}
