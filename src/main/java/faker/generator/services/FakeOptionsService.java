package faker.generator.services;

import com.github.javafaker.Faker;
import faker.generator.*;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.stream.IntStream;

public class FakeOptionsService implements FakeService<FakeOptions> {
    @Override
    public void setValue(FakeOptions annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        switch(annotation.value()){
            case DAY:
                target.set(data, (faker.options().option(IntStream.rangeClosed(annotation.minDay(),annotation.maxDay()).boxed().toArray())).toString());
                break;
            case MONTH:
                target.set(data, (faker.options().option(annotation.months().getDeclaringClass())).toString());
                break;
            case YEAR:
                target.set(data, (faker.options().nextElement(IntStream.rangeClosed(annotation.minYear(),annotation.maxYear()).boxed().toArray())).toString());
                break;
            case DAY_OF_WEEK:
                target.set(data, faker.options().nextElement(Arrays.asList(annotation.days())));
                break;
        }
    }
}