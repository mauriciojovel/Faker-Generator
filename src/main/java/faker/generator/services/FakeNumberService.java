package faker.generator.services;

import net.datafaker.Faker;
import faker.generator.FakeNumber;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import lombok.NonNull;

public class FakeNumberService implements FakeService<FakeNumber> {
    @Override
    public void setValue(FakeNumber annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        switch (annotation.value()) {
            case DIGIT:
                if (annotation.count() > 0) {
                    target.set(data, chooseCorrectType(target,faker.number().digits(annotation.count())));
                } else {
                    target.set(data, chooseCorrectType(target,faker.number().digit()));
                }
                break;
            case NUMBER_BETWEEN:
                if (annotation.minValue() >= 0 && annotation.maxValue() >= 0) {
                    target.set(data, chooseCorrectType(target, faker.number().numberBetween(annotation.minValue(), annotation.maxValue())));
                } else {
                    throw new IllegalArgumentException("You need set the values min value and max value to use this function");
                }
                break;
            case RANDOM_DIGIT:
                target.set(data, chooseCorrectType(target, faker.number().randomDigit()));
                break;
            case RANDOM_DIGIT_NON_ZERO:
                target.set(data, chooseCorrectType(target, faker.number().randomDigitNotZero()));
                break;
            case RANDOM_DOUBLE:
                if (annotation.maxNumberOfDecimal() > -1 && annotation.minValue() >= 0 && annotation.maxValue() >= 0) {
                    target.set(data, chooseCorrectType(target, faker.number().randomDouble(annotation.maxNumberOfDecimal(), annotation.minValue(), annotation.maxValue())));
                } else {
                    throw new IllegalArgumentException("You need set the values, maxNumberOfDecimal, minValue and maxValue");
                }
                break;
            case RANDOM_NUMBER:
                if (annotation.count() > 0) {
                    target.set(data, chooseCorrectType(target, faker.number().randomNumber(annotation.count(), annotation.strict())));
                } else {
                    target.set(data, chooseCorrectType(target, faker.number().randomNumber()));
                }
                break;
        }
    }

    public Object chooseCorrectType(Field target, @NonNull Object number) {
        if (BigDecimal.class.isAssignableFrom(target.getType())) {
            return new BigDecimal(number.toString());
        } else if (BigInteger.class.isAssignableFrom(target.getType())) {
            String integerNumber = number.toString().split("\\.")[0];
            return new BigInteger(integerNumber);
        } else {
            // Try to identify the correct type
            var valueNumber = new BigDecimal(number.toString());
            if (Double.class.isAssignableFrom(target.getType())) {
                return valueNumber.doubleValue();
            } else if (Float.class.isAssignableFrom(target.getType())) {
                return valueNumber.floatValue();
            } else if (Long.class.isAssignableFrom(target.getType())) {
                return valueNumber.longValue();
            } else if (Integer.class.isAssignableFrom(target.getType())) {
                return valueNumber.intValue();
            } else if (Short.class.isAssignableFrom(target.getType())) {
                return valueNumber.shortValue();
            } else if (Byte.class.isAssignableFrom(target.getType())) {
                return valueNumber.byteValue();
            }
            return number;
        }
    }
}
