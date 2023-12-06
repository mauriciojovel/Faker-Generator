package faker.generator;

import faker.generator.models.Demographic;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DemographicTest {
    @Test
    void demographicTest() {
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