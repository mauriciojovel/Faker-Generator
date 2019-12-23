package faker.generator.models;

import faker.generator.FakeStarTrek;
import faker.generator.FakeStarTrekType;
import faker.generator.FakeWeather;
import faker.generator.FakerWeatherType;
import lombok.Data;

@Data
public class StarTrek {

    @FakeStarTrek(FakeStarTrekType.CHARACTER)
    private String character;

    @FakeStarTrek(FakeStarTrekType.LOCATION)
    private String location;

    @FakeStarTrek(FakeStarTrekType.SPECIE)
    private String specie;

    @FakeStarTrek(FakeStarTrekType.VILLAIN)
    private String villain;
}
