package faker.generator;

import faker.generator.models.Demographic;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class DemographicTest {
    @Test
    public void demographicTest() {
        Optional<Demographic> d = FakerGen.create(Demographic.class);
        assertTrue(d.isPresent());
        d.ifPresent(de -> {
            assertNotNull(de.getRace());
            assertNotNull(de.getEducationalAttainment());
            assertNotNull(de.getDemonym());
            assertNotNull(de.getSex());
            assertNotNull(de.getMaritalStatus());
        });
    }
}