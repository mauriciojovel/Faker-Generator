package faker.generator.models;

import faker.generator.FakeRobin;
import faker.generator.FakeRobinType;
import lombok.Data;

@Data
public class Robin {

    @FakeRobin(FakeRobinType.QUOTE)
    private String quote;
}
