package faker.generator;

import faker.generator.models.Bothify;
import java.util.Optional;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BothifyTest {
    @Test
    void testBothify() {
        Optional<Bothify> bothify = FakerGen.create(Bothify.class);
        assertTrue(bothify.isPresent());
        bothify.ifPresent(b -> {
            assertNotNull(b.getFirstCode());
            assertNotNull(b.getSecondCode());
        });
    }
}
