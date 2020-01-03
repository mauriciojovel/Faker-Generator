package faker.generator;

import faker.generator.models.Food;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class FoodTest {
    @Test
    public void foodTest() {
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