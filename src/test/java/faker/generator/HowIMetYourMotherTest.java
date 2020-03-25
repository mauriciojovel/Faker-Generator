package faker.generator;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import faker.generator.FakerGen;
import faker.generator.models.*;

import java.util.Locale;
import java.util.Optional;
import org.junit.Test;

public class HowIMetYourMotherTest {
    @Test
    public void testHowIMetYourMother() {
        Optional<HowIMetYourMother> c = FakerGen.create(HowIMetYourMother.class);
        assertTrue(c.isPresent());
        c.ifPresent(co -> {
            assertNotNull(co.getCharacter());
            assertNotNull(co.getCatchPhrase());
            assertNotNull(co.getHighFive());
            assertNotNull(co.getQuote());
        });
    }
}
