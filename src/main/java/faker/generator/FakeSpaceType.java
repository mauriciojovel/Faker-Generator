package faker.generator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FakeSpaceType {
    PLANET("space.planet"), MOON("space.moon"), GALAXY("space.galaxy"), NEBULA("space.nebula"),
    STAR_CLUSTER("space.star_cluster"), CONSTELLATION("space.constellation"), STAR("space.star"),
    AGENCY("space.agency"), AGENCY_ABBREVIATION("space.agency_abv"), NASA_SPACE_CRAFT("space.nasa_space_craft"),
    SPACE_COMPANY("space.company"), DISTANCE_MEASUREMENT("space.distance_measurement"), METEORITE("space.meteorite");
    private String fakerKey;
}