package faker.generator;

import faker.generator.models.Student;
import java.util.Optional;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class ParentPropertiesTest {
    @Test
    public void shouldBeInitTheParentProperties() {
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
