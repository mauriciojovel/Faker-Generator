package faker.generator.services;

import com.github.javafaker.Faker;
import faker.generator.FakeNumber;

import java.lang.reflect.Field;

public class FakeNumberService implements FakeService<FakeNumber> {
    @Override
    public void setValue(FakeNumber annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        switch (annotation.value()) {
            case DIGIT:
                if (annotation.count() > 0) {
                    target.set(data, faker.number().digits(annotation.count()));

                } else {
                    target.set(data, faker.number().digit());
                }
                break;
            case NUMBER_BETWEEN:
                if (annotation.minValue() >= 0 && annotation.maxValue() >= 0) {
                    target.set(data, faker.number().numberBetween(annotation.minValue(), annotation.maxValue()));
                } else {
                    throw new IllegalArgumentException("You need set the values min value and max value to use this function");
                }
                break;
            case RANDOM_DIGIT:
                target.set(data, faker.number().randomDigit());
                break;
            case RANDOM_DIGIT_NON_ZERO:
                target.set(data, faker.number().randomDigitNotZero());
                break;
            case RANDOM_DOUBLE:
                if (annotation.maxNumberOfDecimal() > -1 && annotation.minValue() >= 0 && annotation.maxValue() >= 0) {
                    target.set(data, faker.number().randomDouble(annotation.maxNumberOfDecimal(), annotation.minValue(), annotation.maxValue()));
                } else {
                    throw new IllegalArgumentException("You need set the values, maxNumberOfDecimal, minValue and maxValue");
                }
                break;
            case RANDOM_NUMBER:
                if (annotation.count() > 0) {
                    target.set(data, faker.number().randomNumber(annotation.count(), annotation.strict()));
                } else {
                    target.set(data, faker.number().randomNumber());
                }
                break;
        }
    }
}
