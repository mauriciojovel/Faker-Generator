package faker.generator;

import faker.generator.models.Cat;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CatTest {

    @Test
    void testCat() {
        Optional<Cat> c = FakerGen.create(Cat.class);
        assertTrue(c.isPresent());
        c.ifPresent(co -> {
            assertNotNull(co.getName());
            assertNotNull(co.getBreed());
            assertNotNull(co.getRegistry());
        });
    }
}
