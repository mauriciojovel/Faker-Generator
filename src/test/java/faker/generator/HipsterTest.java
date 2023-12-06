package faker.generator;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import faker.generator.models.Hipster;
import java.util.Optional;
import org.junit.jupiter.api.Test;

class HipsterTest {

    @Test
    void testHipster() {
        Optional<Hipster> h = FakerGen.create(Hipster.class);
        assertTrue(h.isPresent());
        h.ifPresent(ho -> {
            assertNotNull(ho.getWord());
        });
    }
}
