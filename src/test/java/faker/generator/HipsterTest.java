package faker.generator;

import faker.generator.FakerGen;
import faker.generator.models.Hipster;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class HipsterTest {

    @Test
    public void testHipster() {
        Optional<Hipster> h = FakerGen.create(Hipster.class);
        assertTrue(h.isPresent());
        h.ifPresent(ho -> {
            assertNotNull(ho.getWord());
        });
    }
}
