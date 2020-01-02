package faker.generator.test;

import faker.generator.FakerGen;
import faker.generator.models.Hacker;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class HackerTest {
    @Test
    public void testHacker() {
        Optional<Hacker> h = FakerGen.create(Hacker.class);
        assertTrue(h.isPresent());
        h.ifPresent(ha -> {
            assertNotNull(ha.getAbbreviation());
            assertNotNull(ha.getAdjective());
            assertNotNull(ha.getIngVerb());
            assertNotNull(ha.getNoun());
            assertNotNull(ha.getVerb());
        });
    }


}
