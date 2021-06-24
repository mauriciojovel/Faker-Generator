package faker.generator;

import faker.generator.models.Hobbit;
import java.util.Optional;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class IgnorePropertiesTest {
    @Test
    public void testHobbitIgnoreProperties() {
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
