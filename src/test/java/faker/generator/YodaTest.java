package faker.generator;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import faker.generator.models.Yoda;
import java.util.Optional;
import org.junit.jupiter.api.Test;

class YodaTest {
    @Test
    void testYoda() {
        Optional<Yoda> c = FakerGen.create(Yoda.class);
        assertTrue(c.isPresent());
        c.ifPresent(co -> {
            assertNotNull(co.getQuote());
        });
    }
}
