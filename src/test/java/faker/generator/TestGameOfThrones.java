package faker.generator;

import faker.generator.models.GameOfThrones;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TestGameOfThrones {
    @Test
    void testGameOfThrones() {
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