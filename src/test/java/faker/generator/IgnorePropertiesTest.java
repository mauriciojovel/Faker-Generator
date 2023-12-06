package faker.generator;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import faker.generator.models.Hobbit;
import java.util.Optional;
import org.junit.jupiter.api.Test;

class IgnorePropertiesTest {
    @Test
    void testHobbitIgnoreProperties() {
        Optional<Hobbit> c = FakerGen.create(Hobbit.class, "character", "quote");
        assertTrue(c.isPresent());
        c.ifPresent(co -> {
            assertNull(co.getCharacter());
            assertNotNull(co.getThorinsCompany());
            assertNull(co.getQuote());
            assertNotNull(co.getLocation());
        });
    }
}
