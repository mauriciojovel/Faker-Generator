package faker.generator.models;

import faker.generator.FakeYoda;
import faker.generator.FakeYodaType;
import lombok.Data;

@Data
public class Yoda {

    @FakeYoda(FakeYodaType.QUOTE)
    private String quote;

}
