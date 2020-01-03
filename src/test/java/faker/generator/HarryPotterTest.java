package faker.generator;

import faker.generator.FakerGen;
import faker.generator.models.HarryPotter;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class HarryPotterTest {

    @Test
    public void testHarryPotter() {
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
