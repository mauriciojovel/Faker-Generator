package faker.generator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import faker.generator.FakerGen;
import faker.generator.models.*;

import java.util.Locale;
import java.util.Optional;
import org.junit.Test;

public class LebowskiTest {

    @Test
    public void testLebowski() {
        Optional<Lebowski> c = FakerGen.create(Lebowski.class);
        assertTrue(c.isPresent());
        c.ifPresent(co -> {
            assertNotNull(co.getActor());
            assertNotNull(co.getCharacter());
            assertNotNull(co.getQuote());
        });
    }
}
