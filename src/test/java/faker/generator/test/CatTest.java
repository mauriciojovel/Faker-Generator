package faker.generator.test;

import faker.generator.FakerGen;
import faker.generator.models.Cat;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class CatTest {

    @Test
    public void testCat() {
        Optional<Cat> c = FakerGen.create(Cat.class);
        assertTrue(c.isPresent());
        c.ifPresent(co -> {
            assertNotNull(co.getName());
            assertNotNull(co.getBreed());
            assertNotNull(co.getRegistry());
        });
    }
}
