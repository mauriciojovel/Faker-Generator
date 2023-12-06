package faker.generator;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import faker.generator.models.Weather;
import java.util.Optional;
import org.junit.jupiter.api.Test;

class WeatherTest {

    @Test
    void testWeather() {
        Optional<Weather> c = FakerGen.create(Weather.class);
        assertTrue(c.isPresent());
        c.ifPresent(co -> {
            assertNotNull(co.getDescription());
            assertNotNull(co.getCelsius());
            assertNotNull(co.getFahrenheit());
        });
    }
}
