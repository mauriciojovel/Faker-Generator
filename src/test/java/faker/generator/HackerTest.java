package faker.generator;

import faker.generator.models.Hacker;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class HackerTest {
    @Test
    void testHacker() {
        Optional<Hacker> h = FakerGen.create(Hacker.class);
        assertTrue(h.isPresent());
        h.ifPresent(ha -> {
            assertNotNull(ha.getAbbreviation());
            assertNotNull(ha.getAdjective());
            assertNotNull(ha.getIngVerb());
            assertNotNull(ha.getNoun());
            assertNotNull(ha.getVerb());
        });
    }


}
