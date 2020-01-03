package faker.generator;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import faker.generator.FakerGen;
import faker.generator.models.*;

import java.util.Locale;
import java.util.Optional;
import org.junit.Test;

public class MedicalTest {
    @Test
    public void testMedical() {
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
