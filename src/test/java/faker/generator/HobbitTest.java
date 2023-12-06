package faker.generator;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import faker.generator.models.Hobbit;
import java.util.Optional;
import org.junit.jupiter.api.Test;

class HobbitTest {

    @Test
    void testHobbit() {
        Optional<Hobbit> c = FakerGen.create(Hobbit.class);
        assertTrue(c.isPresent());
        c.ifPresent(co -> {
            assertNotNull(co.getCharacter());
            assertNotNull(co.getThorinsCompany());
            assertNotNull(co.getQuote());
            assertNotNull(co.getLocation());
        });
    }
}
