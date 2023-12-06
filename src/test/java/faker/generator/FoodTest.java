package faker.generator;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import faker.generator.models.Food;
import java.util.Optional;
import org.junit.jupiter.api.Test;

class FoodTest {
    @Test
    void foodTest() {
        Optional<Food> f = FakerGen.create(Food.class);
        assertTrue(f.isPresent());
        f.ifPresent(fo -> {
            assertNotNull(fo.getIngredient());
            assertNotNull(fo.getSpice());
            assertNotNull(fo.getMeasurementSizes());
            assertNotNull(fo.getMeasurements());
        });
    }
}