package faker.generator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FakeAddressType {
    STREET_NAME("address.street_name"), STREET_ADDRESS_NUMBER(""), STREET_ADDRESS("address.street_address"),
    SECONDARY_ADDRESS("address.secondary_address"), ZIP_CODE("address.postcode"), ZIP_CODE_BY_STATE("address.postcode_by_state."),
    COUNTY_BY_ZIP_CODE("address.county_by_postcode."), STREET_SUFFIX("address.street_suffix"), STREET_PREFIX("address.street_prefix"),
    CITY_SUFFIX("address.city_suffix"), CITY_PREFIX("address.city_prefix"), CITY("address.city"), CITY_NAME("address.city_name"),
    STATE("address.state"), STATE_ABBR("address.state_abbr"), LATITUDE(""), LONGITUDE(""), TIME_ZONE("address.time_zone"),
    COUNTRY("address.country"), COUNTRY_CODE("address.country_code"), BUILDING_NUMBER("address.building_number"),
    FULL_ADDRESS("address.full_address");
    private String type;
}
