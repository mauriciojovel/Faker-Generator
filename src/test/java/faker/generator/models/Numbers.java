package faker.generator.models;

import faker.generator.FakeNumber;
import faker.generator.FakeNumberType;
import lombok.Data;

@Data
public class Numbers {
    @FakeNumber(FakeNumberType.DIGIT)
    private String digit;

    @FakeNumber(value = FakeNumberType.NUMBER_BETWEEN, minValue = 0, maxValue = 10)
    private Integer numberBetween;

    @FakeNumber(FakeNumberType.RANDOM_DIGIT)
    private Integer randomDigit;

    @FakeNumber(FakeNumberType.RANDOM_DIGIT_NON_ZERO)
    private Integer randomDigitNonZero;

    @FakeNumber(value = FakeNumberType.RANDOM_DOUBLE, maxNumberOfDecimal = 2, minValue = 1, maxValue = 100)
    private Double randomDouble;

    @FakeNumber(value = FakeNumberType.RANDOM_NUMBER, count = 2, strict = true)
    private Long randomNumber;

    @FakeNumber
    private Long randomNumber2;
}
