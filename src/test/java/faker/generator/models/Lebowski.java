package faker.generator.models;

import faker.generator.FakeLebowski;
import faker.generator.FakeLebowskiType;
import lombok.Data;

@Data
public class Lebowski {

    @FakeLebowski(FakeLebowskiType.ACTOR)
    private String actor;

    @FakeLebowski(FakeLebowskiType.CHARACTER)
    private String character;

    @FakeLebowski(FakeLebowskiType.QUOTE)
    private String quote;
}
