package faker.generator;

import faker.generator.FakerGen;
import faker.generator.models.*;
import java.util.Optional;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class OverwatchTest {

    @Test
    public void testOverwatch() {
        Optional<Overwatch> c = FakerGen.create(Overwatch.class);
        assertTrue(c.isPresent());
        c.ifPresent(co -> {
            assertNotNull(co.getHero());
            assertNotNull(co.getLocation());
            assertNotNull(co.getQuote());
        });
    }

}
