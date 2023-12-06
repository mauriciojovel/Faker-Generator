package faker.generator;

import faker.generator.models.Superhero;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SuperheroTest {
    @Test
    void superheroTest() {
        Optional<Superhero> s = FakerGen.create(Superhero.class);
        assertTrue(s.isPresent());
        s.ifPresent(sh -> {
            assertNotNull(sh.getName());
            assertNotNull(sh.getPrefix());
            assertNotNull(sh.getSuffix());
            assertNotNull(sh.getPower());
            assertNotNull(sh.getDescriptor());
        });
    }
}
