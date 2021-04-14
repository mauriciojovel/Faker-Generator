package faker.generator.models;

import faker.generator.FakeBothify;
import lombok.Data;

@Data
public class Bothify {

    @FakeBothify("AA###???")
    private String firstCode;

    @FakeBothify(value = "B?#####??", isUpperCase = true)
    private String secondCode;
}
