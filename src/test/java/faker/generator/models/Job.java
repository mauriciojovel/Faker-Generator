package faker.generator.models;

import faker.generator.FakeJob;
import faker.generator.FakeJobType;
import lombok.Data;

@Data
public class Job {

    @FakeJob(FakeJobType.FIELD)
    private String field;

    @FakeJob(FakeJobType.SENIORITY)
    private String seniority;

    @FakeJob(FakeJobType.POSITION)
    private String position;

    @FakeJob(FakeJobType.KEY_SKILLS)
    private String keySkills;

    @FakeJob(FakeJobType.TITLE)
    private String title;
}
