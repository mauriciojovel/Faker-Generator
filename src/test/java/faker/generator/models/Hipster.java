package faker.generator.models;

import faker.generator.FakeHipster;
import faker.generator.FakeHipsterType;
import lombok.Data;

@Data
public class Hipster {

    @FakeHipster(FakeHipsterType.WORD)
    private String word;
}
