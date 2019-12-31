package faker.generator.models;

import faker.generator.FakeOverwatch;
import faker.generator.FakeOverwatchType;
import lombok.Data;

@Data
public class Overwatch {
    @FakeOverwatch(FakeOverwatchType.HERO)
    private String hero;

    @FakeOverwatch(FakeOverwatchType.LOCATION)
    private String location;

    @FakeOverwatch(FakeOverwatchType.QUOTE)
    private String quote;
}
