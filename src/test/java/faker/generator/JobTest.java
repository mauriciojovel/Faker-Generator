package faker.generator;

import faker.generator.FakerGen;
import faker.generator.models.Job;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class JobTest {

    @Test
    public void testJob() {
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