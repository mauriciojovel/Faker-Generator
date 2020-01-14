package faker.generator;

import faker.generator.models.Matz;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class MatzTest {
    @Test
    public void testMatz() {
        Optional<Matz> c = FakerGen.create(Matz.class);
        assertTrue(c.isPresent());
        c.ifPresent(co -> {
            assertNotNull(co.getQuote());
        });
    }
}
