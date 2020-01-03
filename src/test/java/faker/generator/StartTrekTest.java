package faker.generator;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import faker.generator.FakerGen;
import faker.generator.models.*;
import java.util.Optional;
import org.junit.Test;

public class StartTrekTest {
    @Test
    public void testStarTrek() {
        Optional<StarTrek> c = FakerGen.create(StarTrek.class);
        assertTrue(c.isPresent());
        c.ifPresent(co -> {
            assertNotNull(co.getCharacter());
            assertNotNull(co.getLocation());
            assertNotNull(co.getSpecie());
            assertNotNull(co.getVillain());
        });
    }
}
