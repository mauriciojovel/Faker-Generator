package faker.generator;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import faker.generator.models.Shakespeare;
import java.util.Optional;
import org.junit.jupiter.api.Test;

class ShakespeareTest {
    @Test
    void shakespeareTest() {
        Optional<Shakespeare> s = FakerGen.create(Shakespeare.class);
        assertTrue(s.isPresent());
        s.ifPresent(sh -> {
            assertNotNull(sh.getHamletQuote());
            assertNotNull(sh.getAsYouLikeItQuote());
            assertNotNull(sh.getKingRichardQuote());
            assertNotNull(sh.getRomeoJulietQuote());
        });
    }
}