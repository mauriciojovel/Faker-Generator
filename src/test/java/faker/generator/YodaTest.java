package faker.generator;

import faker.generator.models.Yoda;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class YodaTest {
    @Test
    public void testYoda() {
        Optional<Yoda> c = FakerGen.create(Yoda.class);
        assertTrue(c.isPresent());
        c.ifPresent(co -> {
            assertNotNull(co.getQuote());
        });
    }
}
