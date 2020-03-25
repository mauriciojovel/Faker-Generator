package faker.generator;

import faker.generator.models.DragonBall;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class DragonBallTest {
    @Test
    public void testDragonBall() {
        Optional<DragonBall> c = FakerGen.create(DragonBall.class);
        assertTrue(c.isPresent());
        c.ifPresent(co -> {
            assertNotNull(co.getCharacter());
        });
    }
}
