package faker.generator;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import faker.generator.models.Overwatch;
import java.util.Optional;
import org.junit.jupiter.api.Test;

class OverwatchTest {

    @Test
    void testOverwatch() {
        Optional<Overwatch> c = FakerGen.create(Overwatch.class);
        assertTrue(c.isPresent());
        c.ifPresent(co -> {
            assertNotNull(co.getHero());
            assertNotNull(co.getLocation());
            assertNotNull(co.getQuote());
        });
    }

}
