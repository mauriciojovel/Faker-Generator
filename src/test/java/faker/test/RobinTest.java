package faker.test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import faker.generator.FakerGen;
import faker.generator.models.*;

import java.util.Locale;
import java.util.Optional;
import org.junit.Test;

public class RobinTest {

    @Test
    public void testRobin() {
        Optional<Robin> c = FakerGen.create(Robin.class);
        assertTrue(c.isPresent());
        c.ifPresent(co -> {
            assertNotNull(co.getQuote());
        });
    }
}
