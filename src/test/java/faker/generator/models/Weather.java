package faker.generator.models;
import faker.generator.FakeWeather;
import faker.generator.FakerWeatherType;
import lombok.Data;

@Data
public class Weather {

    @FakeWeather(FakerWeatherType.DESCRIPTION)
    private String description;

    @FakeWeather(FakerWeatherType.CELSIUS)
    private String celsius;

    @FakeWeather(FakerWeatherType.FAHRENHEIT)
    private String fahrenheit;
}
