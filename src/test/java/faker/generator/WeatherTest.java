package faker.generator;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import faker.generator.models.*;
import java.util.Optional;
import org.junit.Test;

public class WeatherTest {

    @Test
    public void testWeather() {
        Optional<Weather> c = FakerGen.create(Weather.class);
        assertTrue(c.isPresent());
        c.ifPresent(co -> {
            assertNotNull(co.getDescription());
            assertNotNull(co.getCelsius());
            assertNotNull(co.getFahrenheit());
        });
    }
}
