package faker.generator;

import faker.generator.models.Bothify;
import java.util.Optional;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class BothifyTest {
    @Test
    public void testBothify() {
        Optional<Bothify> bothify = FakerGen.create(Bothify.class);
        assertTrue(bothify.isPresent());
        bothify.ifPresent(b -> {
            assertNotNull(b.getFirstCode());
            assertNotNull(b.getSecondCode());
        });
    }
}
