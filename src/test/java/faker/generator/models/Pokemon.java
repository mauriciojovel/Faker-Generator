package faker.generator.models;

import faker.generator.FakePokemon;
import faker.generator.FakePokemonType;
import lombok.Data;

@Data
public class Pokemon {
    @FakePokemon
    private String name;

    @FakePokemon(FakePokemonType.LOCATION)
    private String location;
}
