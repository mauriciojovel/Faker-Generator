package faker.generator;

import faker.generator.models.Bool;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class BoolTest {
    @Test
    public void boolTest() {
        Optional<Bool> b = FakerGen.create(Bool.class);
        assertTrue(b.isPresent());
        b.ifPresent(bo -> {
            assertNotNull(bo.getBool());
        });
    }
}