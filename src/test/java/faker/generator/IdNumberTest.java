package faker.generator;

import faker.generator.FakerGen;
import faker.generator.models.IdNumber;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class IdNumberTest {
    @Test
    public void IdNumberTest() {
        Optional<IdNumber> i = FakerGen.create(IdNumber.class);
        assertTrue(i.isPresent());
        i.ifPresent(in -> {
            assertNotNull(in.getValidNumber());
            assertNotNull(in.getInvalidNumber());
        });
    }
}