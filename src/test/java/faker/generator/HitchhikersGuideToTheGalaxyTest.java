package faker.generator;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import faker.generator.models.HitchhikersGuideToTheGalaxy;
import java.util.Optional;
import org.junit.jupiter.api.Test;

class HitchhikersGuideToTheGalaxyTest {

    @Test
    void testHitchhikersGuideToTheGalaxy() {
        Optional<HitchhikersGuideToTheGalaxy> c = FakerGen.create(HitchhikersGuideToTheGalaxy.class);
        assertTrue(c.isPresent());
        c.ifPresent(co -> {
            assertNotNull(co.getCharacter());
            assertNotNull(co.getQuote());
            assertNotNull(co.getLocation());
            assertNotNull(co.getMarvinQuote());
            assertNotNull(co.getPlanet());
            assertNotNull(co.getSpecie());
            assertNotNull(co.getStarShip());
        });
    }
}
