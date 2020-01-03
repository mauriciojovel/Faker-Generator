package faker.generator.models;

import faker.generator.FakeEducator;
import faker.generator.FakeEducatorType;
import lombok.Data;

@Data
public class Educator {
    @FakeEducator(FakeEducatorType.UNIVERSITY)
    private String university;

    @FakeEducator(FakeEducatorType.COURSE)
    private String course;

    @FakeEducator(FakeEducatorType.SECONDARY_SCHOOL)
    private String secondarySchool;

    @FakeEducator(FakeEducatorType.CAMPUS)
    private String campus;
}