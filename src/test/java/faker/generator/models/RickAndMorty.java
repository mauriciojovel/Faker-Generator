package faker.generator.models;

import faker.generator.FakeRickAndMorty;
import faker.generator.FakeRickAndMortyType;
import lombok.Data;

@Data
public class RickAndMorty {

    @FakeRickAndMorty(FakeRickAndMortyType.CHARACTER)
    private String character;

    @FakeRickAndMorty(FakeRickAndMortyType.LOCATION)
    private String location;

    @FakeRickAndMorty(FakeRickAndMortyType.QUOTE)
    private String quote;
}
