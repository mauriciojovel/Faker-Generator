package faker.generator.models;

import faker.generator.FakeNumber;
import faker.generator.FakeNumberType;
import lombok.Data;

@Data
public class NumbersDoubleException {
    @FakeNumber(value = FakeNumberType.RANDOM_DOUBLE)
    private Double numberBetween;
}
