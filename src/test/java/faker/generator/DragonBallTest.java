package faker.generator;

import faker.generator.models.DragonBall;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DragonBallTest {
    @Test
    void testDragonBall() {
        Optional<DragonBall> c = FakerGen.create(DragonBall.class);
        assertTrue(c.isPresent());
        c.ifPresent(co -> {
            assertNotNull(co.getCharacter());
        });
    }
}
