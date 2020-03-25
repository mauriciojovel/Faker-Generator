package faker.generator;

import faker.generator.models.FunnyName;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class FunnyNameTest {
    @Test
    public void testFunnyName() {
        Optional<FunnyName> c = FakerGen.create(FunnyName.class);
        assertTrue(c.isPresent());
        c.ifPresent(co -> {
            assertNotNull(co.getName());
        });
    }
}
