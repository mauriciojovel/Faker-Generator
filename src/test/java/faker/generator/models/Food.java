package faker.generator.models;

import faker.generator.FakeFood;
import faker.generator.FakeFoodType;
import lombok.Data;

@Data
public class Food {
    @FakeFood(FakeFoodType.INGREDIENT)
    private String ingredient;

    @FakeFood(FakeFoodType.SPICE)
    private String spice;

    @FakeFood(FakeFoodType.MEASUREMENT_SIZES)
    private String measurementSizes;

    @FakeFood(FakeFoodType.MEASUREMENTS)
    private String measurements;
}