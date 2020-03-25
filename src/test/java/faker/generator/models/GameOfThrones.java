package faker.generator.models;

import faker.generator.FakeGameOfThrones;
import faker.generator.FakeGameOfThronesType;
import lombok.Data;

@Data
public class GameOfThrones {
    @FakeGameOfThrones(FakeGameOfThronesType.CHARACTER)
    private String character;

    @FakeGameOfThrones(FakeGameOfThronesType.HOUSES)
    private String houses;

    @FakeGameOfThrones(FakeGameOfThronesType.CITIES)
    private String cities;

    @FakeGameOfThrones(FakeGameOfThronesType.DRAGONS)
    private String dragons;

    @FakeGameOfThrones(FakeGameOfThronesType.QUOTES)
    private String quotes;
}
