package faker.generator.services;

import com.github.javafaker.Faker;
import faker.generator.FakeLebowski;

import java.lang.reflect.Field;

public class FakeLebowskiService implements FakeService<FakeLebowski> {
    @Override
    public void setValue(FakeLebowski annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        switch (annotation.value()) {
            case ACTOR:
                target.set(data, faker.lebowski().actor());
                break;
            case CHARACTER:
                target.set(data, faker.lebowski().character());
                break;
            case QUOTE:
                target.set(data, faker.lebowski().quote());
                break;
        }
    }
}
