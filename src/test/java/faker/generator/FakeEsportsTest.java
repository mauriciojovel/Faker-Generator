package faker.generator;

import faker.generator.FakerGen;
import faker.generator.models.Esports;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FakeEsportsTest {

    @Test
    void testEsports() {
        Optional<Esports> es = FakerGen.create(Esports.class);
        assertTrue(es.isPresent());
        es.ifPresent(eso -> {
            assertNotNull(eso.getPlayer());
            assertNotNull(eso.getTeam());
            assertNotNull(eso.getEvent());
            assertNotNull(eso.getLeague());
            assertNotNull(eso.getGame());
        });
    }
}
