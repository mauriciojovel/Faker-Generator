package faker.generator;

import faker.generator.models.Student;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ParentPropertiesTest {
    @Test
    void shouldBeInitTheParentProperties() {
        Optional<Student> student = FakerGen.create(Student.class);
        assertTrue(student.isPresent());
        student.ifPresent(s -> {
            assertNotNull(s.getStudentId());
            assertNotNull(s.getName());
            assertNotNull(s.getFirstName());
            assertNotNull(s.getNameWithMiddle());
        });
    }
}
