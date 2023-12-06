package faker.generator;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import faker.generator.models.HarryPotter;
import java.util.Optional;
import org.junit.jupiter.api.Test;

class HarryPotterTest {

    @Test
    void testHarryPotter() {
        Optional<HarryPotter> h = FakerGen.create(HarryPotter.class);
        assertTrue(h.isPresent());
        h.ifPresent(ho -> {
            assertNotNull(ho.getCharacter());
            assertNotNull(ho.getLocation());
            assertNotNull(ho.getQuote());
            assertNotNull(ho.getBook());
        });
    }
}
