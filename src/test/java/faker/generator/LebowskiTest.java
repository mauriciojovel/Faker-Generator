package faker.generator;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import faker.generator.models.Lebowski;
import java.util.Optional;
import org.junit.jupiter.api.Test;

class LebowskiTest {

    @Test
    void testLebowski() {
        Optional<Lebowski> c = FakerGen.create(Lebowski.class);
        assertTrue(c.isPresent());
        c.ifPresent(co -> {
            assertNotNull(co.getActor());
            assertNotNull(co.getCharacter());
            assertNotNull(co.getQuote());
        });
    }
}
