package faker.generator;

import faker.generator.models.Shakespeare;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class ShakespeareTest {
    @Test
    public void shakespeareTest() {
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