package faker.generator;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import faker.generator.models.Options;
import java.util.Optional;
import org.junit.jupiter.api.Test;


class OptionsTest {
    @Test
    void optionsTest() {
        Optional<Options> o = FakerGen.create(Options.class);
        assertTrue(o.isPresent());
        o.ifPresent(op -> {
            assertNotNull(op.getStringOptions());
            assertNotNull(op.getDoubleOptions());
            assertNotNull(op.getIntOptions());
        });
    }
}