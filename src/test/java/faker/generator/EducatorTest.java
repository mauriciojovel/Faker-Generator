package faker.generator;

import faker.generator.models.Educator;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EducatorTest  {
    @Test
    void educatorTest() {
        Optional<Educator> e = FakerGen.create(Educator.class);
        assertTrue(e.isPresent());
        e.ifPresent(ed -> {
            assertNotNull(ed.getUniversity());
            assertNotNull(ed.getCourse());
            assertNotNull(ed.getSecondarySchool());
            assertNotNull(ed.getCampus());
        });
    }
}
