package faker.generator;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import faker.generator.models.Witcher;
import java.util.Optional;
import org.junit.jupiter.api.Test;

class WitcherTest {
    @Test
    void testWitcher() {
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
