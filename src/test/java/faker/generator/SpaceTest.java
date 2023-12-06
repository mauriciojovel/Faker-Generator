package faker.generator;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import faker.generator.models.Space;
import java.util.Optional;
import org.junit.jupiter.api.Test;

class SpaceTest {
    @Test
    void spaceTest() {
        Optional<Space> s = FakerGen.create(Space.class);
        assertTrue(s.isPresent());
        s.ifPresent(sp -> {
            assertNotNull(sp.getPlanet());
            assertNotNull(sp.getMoon());
            assertNotNull(sp.getGalaxy());
            assertNotNull(sp.getNebula());
            assertNotNull(sp.getStarCluster());
            assertNotNull(sp.getConstellation());
            assertNotNull(sp.getStar());
            assertNotNull(sp.getAgency());
            assertNotNull(sp.getAgencyAbbreviation());
            assertNotNull(sp.getNasaSpaceCraft());
            assertNotNull(sp.getSpaceCompany());
            assertNotNull(sp.getDistanceMeasurement());
            assertNotNull(sp.getMeteorite());
        });
    }
}