package faker.generator.models;

import faker.generator.FakeUniversity;
import faker.generator.FakeUniversityType;
import lombok.Data;

@Data
public class University {

    @FakeUniversity(FakeUniversityType.NAME)
    private String name;

    @FakeUniversity(FakeUniversityType.PREFIX)
    private String prefix;

    @FakeUniversity(FakeUniversityType.SUFFIX)
    private String suffix;
}
