package faker.generator;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import faker.generator.models.Medical;
import java.util.Optional;
import org.junit.jupiter.api.Test;

class MedicalTest {
    @Test
    void testMedical() {
        Optional<Medical> b = FakerGen.create(Medical.class);
        assertTrue(b.isPresent());
        b.ifPresent(bo -> {
            assertNotNull(bo.getMedicineName());
            assertNotNull(bo.getDiseaseName());
            assertNotNull(bo.getHospitalName());
            assertNotNull(bo.getSymptom());
        });
    }
}
