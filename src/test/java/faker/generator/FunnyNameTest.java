package faker.generator;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import faker.generator.models.FunnyName;
import java.util.Optional;
import org.junit.jupiter.api.Test;

class FunnyNameTest {
    @Test
    void testFunnyName() {
        Optional<FunnyName> c = FakerGen.create(FunnyName.class);
        assertTrue(c.isPresent());
        c.ifPresent(co -> {
            assertNotNull(co.getName());
        });
    }
}
