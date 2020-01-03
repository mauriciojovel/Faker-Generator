package faker.generator.models;

import faker.generator.FakeDemographic;
import faker.generator.FakeDemographicType;
import lombok.Data;

@Data
public class Demographic {
    @FakeDemographic(FakeDemographicType.RACE)
    private String race;

    @FakeDemographic(FakeDemographicType.EDUCATIONAL_ATTAINMENT)
    private String educationalAttainment;

    @FakeDemographic(FakeDemographicType.DEMONYM)
    private String demonym;

    @FakeDemographic(FakeDemographicType.SEX)
    private String sex;

    @FakeDemographic(FakeDemographicType.MARITAL_STATUS)
    private String maritalStatus;
}
