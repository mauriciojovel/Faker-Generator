package faker.generator;
import faker.generator.FakerGen;
import faker.generator.models.*;

import java.util.Locale;
import java.util.Optional;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class HobbitTest {

    @Test
    public void testHobbit() {
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
