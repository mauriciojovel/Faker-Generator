package faker.generator;

import faker.generator.models.GameOfThrones;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class TestGameOfThrones {
    @Test
    public void testGameOfThrones() {
        Optional<GameOfThrones> g = FakerGen.create(GameOfThrones.class);
        assertTrue(g.isPresent());
        g.ifPresent(got -> {
            assertNotNull(got.getCharacter());
            assertNotNull(got.getHouses());
            assertNotNull(got.getCities());
            assertNotNull(got.getDragons());
            assertNotNull(got.getQuotes());
        });
    }
}