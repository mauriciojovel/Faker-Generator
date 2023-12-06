package faker.generator;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import faker.generator.models.IdNumber;
import java.util.Optional;
import org.junit.jupiter.api.Test;

class IdNumberTest {
    @Test
    void IdNumberTest() {
        Optional<IdNumber> i = FakerGen.create(IdNumber.class);
        assertTrue(i.isPresent());
        i.ifPresent(in -> {
            assertNotNull(in.getValidNumber());
            assertNotNull(in.getInvalidNumber());
        });
    }
}