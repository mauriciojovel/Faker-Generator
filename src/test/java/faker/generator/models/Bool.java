package faker.generator.models;

import faker.generator.FakeBool;
import lombok.Data;

@Data
public class Bool {
    @FakeBool
    private Boolean bool;
}
