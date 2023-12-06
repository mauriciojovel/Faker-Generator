package faker.generator;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import faker.generator.FakerGen;
import faker.generator.models.*;
import java.util.Optional;
import org.junit.jupiter.api.Test;

class StartTrekTest {
    @Test
    void testStarTrek() {
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
