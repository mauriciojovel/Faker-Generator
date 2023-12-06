package faker.generator.services;

import net.datafaker.Faker;
import faker.generator.FakeBool;

import java.lang.reflect.Field;

public class FakeBoolService implements FakeService<FakeBool> {
    @Override
    public void setValue(FakeBool annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        target.set(data, faker.bool().bool());
    }
}