package faker.generator;

import faker.generator.models.HitchhikersGuideToTheGalaxy;
import faker.generator.models.Hobbit;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class HitchhikersGuideToTheGalaxyTest {

    @Test
    public void testHitchhikersGuideToTheGalaxy() {
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
