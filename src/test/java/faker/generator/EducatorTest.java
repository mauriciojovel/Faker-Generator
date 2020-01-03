package faker.generator;

import faker.generator.models.Educator;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class EducatorTest  {
    @Test
    public void educatorTest() {
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
