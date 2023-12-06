package faker.generator;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import faker.generator.models.Matz;
import java.util.Optional;
import org.junit.jupiter.api.Test;

class MatzTest {
    @Test
    void testMatz() {
        Optional<Matz> c = FakerGen.create(Matz.class);
        assertTrue(c.isPresent());
        c.ifPresent(co -> {
            assertNotNull(co.getQuote());
        });
    }
}
