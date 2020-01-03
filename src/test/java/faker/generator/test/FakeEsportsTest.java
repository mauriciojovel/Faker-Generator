package faker.generator.test;

import faker.generator.FakerGen;
import faker.generator.models.Esports;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class FakeEsportsTest {

    @Test
    public void testEsports() {
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
