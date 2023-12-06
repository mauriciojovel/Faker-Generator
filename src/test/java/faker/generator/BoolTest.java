package faker.generator;

import faker.generator.models.Bool;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BoolTest {
    @Test
    void boolTest() {
        Optional<Bool> b = FakerGen.create(Bool.class);
        assertTrue(b.isPresent());
        b.ifPresent(bo -> {
            assertNotNull(bo.getBool());
        });
    }
}