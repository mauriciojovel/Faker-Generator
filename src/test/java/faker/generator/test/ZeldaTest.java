package faker.generator.test;

import faker.generator.FakerGen;
import faker.generator.models.Zelda;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class ZeldaTest {

    @Test
    public void testZelda() {
        Optional<Zelda> z = FakerGen.create(Zelda.class);
        assertTrue(z.isPresent());
        z.ifPresent(zo -> {
            assertNotNull(zo.getGame());
            assertNotNull(zo.getCharacter());
        });
    }

}
