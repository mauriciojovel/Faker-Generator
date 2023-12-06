package faker.generator;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import faker.generator.models.Zelda;
import java.util.Optional;
import org.junit.jupiter.api.Test;

class ZeldaTest {

    @Test
    void testZelda() {
        Optional<Zelda> z = FakerGen.create(Zelda.class);
        assertTrue(z.isPresent());
        z.ifPresent(zo -> {
            assertNotNull(zo.getGame());
            assertNotNull(zo.getCharacter());
        });
    }

}
