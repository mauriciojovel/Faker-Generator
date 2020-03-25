package faker.generator.models;

import faker.generator.FakeSuperhero;
import faker.generator.FakerSuperheroType;
import lombok.Data;

@Data
public class Superhero {
    @FakeSuperhero(FakerSuperheroType.NAME)
    private String name;

    @FakeSuperhero(FakerSuperheroType.PREFIX)
    private String prefix;

    @FakeSuperhero(FakerSuperheroType.SUFFIX)
    private String suffix;

    @FakeSuperhero(FakerSuperheroType.POWER)
    private String power;

    @FakeSuperhero(FakerSuperheroType.DESCRIPTOR)
    private String descriptor;
}
