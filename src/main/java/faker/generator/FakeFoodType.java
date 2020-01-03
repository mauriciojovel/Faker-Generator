package faker.generator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FakeFoodType {
    INGREDIENT("food.ingredients"), SPICE("food.spices"), MEASUREMENT_SIZES("food.measurement_sizes"), MEASUREMENTS("food.measurements");
    private String fakerKey;
}