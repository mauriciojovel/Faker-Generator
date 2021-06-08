package faker.generator.models;

import faker.generator.FakeBothify;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Student extends Person {
    @FakeBothify(value = "###??####??", isUpperCase = true)
    private String studentId;
}
