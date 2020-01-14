package faker.generator;

import faker.generator.models.Witcher;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class WitcherTest {
    @Test
    public void testWitcher() {
        Optional<Witcher> c = FakerGen.create(Witcher.class);
        assertTrue(c.isPresent());
        c.ifPresent(co -> {
            assertNotNull(co.getCharacter());
            assertNotNull(co.getLocation());
            assertNotNull(co.getMonster());
            assertNotNull(co.getSchool());
            assertNotNull(co.getWitcher());
            assertNotNull(co.getQuote());
        });
    }
}
