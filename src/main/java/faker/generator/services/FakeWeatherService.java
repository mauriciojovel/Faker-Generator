package faker.generator.services;

import com.github.javafaker.Faker;
import faker.generator.FakeWeather;

import java.lang.reflect.Field;

public class FakeWeatherService implements FakeService<FakeWeather> {
    @Override
    public void setValue(FakeWeather annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        switch (annotation.value()) {
            case DESCRIPTION:
                target.set(data, faker.weather().description());
                break;
            case CELSIUS:
                target.set(data, faker.weather().temperatureCelsius());
                break;
            case FAHRENHEIT:
                target.set(data, faker.weather().temperatureFahrenheit());
                break;
        }
    }
}
