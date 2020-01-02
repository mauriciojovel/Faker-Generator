package faker.generator;

import faker.generator.models.University;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class UniversityTest {

    @Test
    public void testUniversity() {
        Optional<University> u = FakerGen.create(University.class);
        assertTrue(u.isPresent());
        u.ifPresent(uo -> {
            assertNotNull(uo.getName());
            assertNotNull(uo.getPrefix());
            assertNotNull(uo.getSuffix());
        });
    }
}
