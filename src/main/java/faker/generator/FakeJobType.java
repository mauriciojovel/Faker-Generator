package faker.generator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FakeJobType {
    FIELD("job.field"), SENIORITY("job.seniority"), POSITION("job.position"), KEY_SKILLS("job.key_skills"), TITLE("job.title");
    private String fakerKey;
}