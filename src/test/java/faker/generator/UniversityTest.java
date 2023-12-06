package faker.generator;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import faker.generator.models.University;
import java.util.Optional;
import org.junit.jupiter.api.Test;

class UniversityTest {

    @Test
    void testUniversity() {
        Optional<University> u = FakerGen.create(University.class);
        assertTrue(u.isPresent());
        u.ifPresent(uo -> {
            assertNotNull(uo.getName());
            assertNotNull(uo.getPrefix());
            assertNotNull(uo.getSuffix());
        });
    }
}
