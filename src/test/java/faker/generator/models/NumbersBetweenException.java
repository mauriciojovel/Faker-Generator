package faker.generator.models;

import faker.generator.FakeNumber;
import faker.generator.FakeNumberType;
import lombok.Data;

@Data
public class NumbersBetweenException {
    @FakeNumber(value = FakeNumberType.NUMBER_BETWEEN)
    private Integer numberBetween;
}
