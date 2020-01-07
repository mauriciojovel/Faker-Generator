package faker.generator;

import faker.generator.models.Options;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class OptionsTest {
    @Test
    public void optionsTest() {
        Optional<Options> o = FakerGen.create(Options.class);
        assertTrue(o.isPresent());
        o.ifPresent(op -> {
            assertNotNull(op.getDay());
            assertNotNull(op.getMonth());
            assertNotNull(op.getYear());
            assertNotNull(op.getDayOfWeek());
        });
    }
}