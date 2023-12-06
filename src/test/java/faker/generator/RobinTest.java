package faker.generator;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import faker.generator.models.Robin;
import java.util.Optional;
import org.junit.jupiter.api.Test;

class RobinTest {

    @Test
    void testRobin() {
        Optional<Robin> c = FakerGen.create(Robin.class);
        assertTrue(c.isPresent());
        c.ifPresent(co -> {
            assertNotNull(co.getQuote());
        });
    }
}
