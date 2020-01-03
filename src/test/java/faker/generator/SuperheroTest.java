package faker.generator;

import faker.generator.models.Superhero;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class SuperheroTest {
    @Test
    public void superheroTest() {
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
