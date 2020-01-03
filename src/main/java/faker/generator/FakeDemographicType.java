package faker.generator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FakeDemographicType {
    RACE("demographic.race"), EDUCATIONAL_ATTAINMENT("demographic.educational_attainment"), DEMONYM("demographic.demonym"),
    SEX("demographic.sex"), MARITAL_STATUS("demographic.marital_status");

    private String fakerKey;
}
