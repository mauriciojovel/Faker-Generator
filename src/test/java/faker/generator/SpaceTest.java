package faker.generator;

import faker.generator.models.Space;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class SpaceTest {
    @Test
    public void spaceTest() {
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