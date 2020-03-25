package faker.generator.models;

import faker.generator.FakeSpace;
import faker.generator.FakeSpaceType;
import lombok.Data;

@Data
public class Space {
    @FakeSpace(FakeSpaceType.PLANET)
    private String planet;

    @FakeSpace(FakeSpaceType.MOON)
    private String moon;

    @FakeSpace(FakeSpaceType.GALAXY)
    private String galaxy;

    @FakeSpace(FakeSpaceType.NEBULA)
    private String nebula;

    @FakeSpace(FakeSpaceType.STAR_CLUSTER)
    private String starCluster;

    @FakeSpace(FakeSpaceType.CONSTELLATION)
    private String constellation;

    @FakeSpace(FakeSpaceType.STAR)
    private String star;

    @FakeSpace(FakeSpaceType.AGENCY)
    private String agency;

    @FakeSpace(FakeSpaceType.AGENCY_ABBREVIATION)
    private String agencyAbbreviation;

    @FakeSpace(FakeSpaceType.NASA_SPACE_CRAFT)
    private String nasaSpaceCraft;

    @FakeSpace(FakeSpaceType.SPACE_COMPANY)
    private String spaceCompany;

    @FakeSpace(FakeSpaceType.DISTANCE_MEASUREMENT)
    private String distanceMeasurement;

    @FakeSpace(FakeSpaceType.METEORITE)
    private String meteorite;
}
