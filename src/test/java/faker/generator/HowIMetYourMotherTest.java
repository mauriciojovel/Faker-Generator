package faker.generator;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import faker.generator.models.HowIMetYourMother;
import java.util.Optional;
import org.junit.jupiter.api.Test;

class HowIMetYourMotherTest {
    @Test
    void testHowIMetYourMother() {
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
