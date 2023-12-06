package faker.generator;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import faker.generator.models.Job;
import java.util.Optional;
import org.junit.jupiter.api.Test;

class JobTest {

    @Test
    void testJob() {
        Optional<Job> j = FakerGen.create(Job.class);
        assertTrue(j.isPresent());
        j.ifPresent(jo -> {
            assertNotNull(jo.getField());
            assertNotNull(jo.getSeniority());
            assertNotNull(jo.getPosition());
            assertNotNull(jo.getKeySkills());
            assertNotNull(jo.getTitle());
        });
    }
}