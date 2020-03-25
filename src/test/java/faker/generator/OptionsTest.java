package faker.generator;

import faker.generator.models.Options;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class OptionsTest {
    @Test
    public void optionsTest() {
        Optional<Options> o = FakerGen.create(Options.class);
        assertTrue(o.isPresent());
        o.ifPresent(op -> {
            assertNotNull(op.getStringOptions());
            assertNotNull(op.getDoubleOptions());
            assertNotNull(op.getIntOptions());
        });
    }
}