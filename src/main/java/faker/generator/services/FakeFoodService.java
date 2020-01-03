package faker.generator.services;

import com.github.javafaker.Faker;
import faker.generator.FakeFood;

import java.lang.reflect.Field;

public class FakeFoodService implements FakeService<FakeFood> {
    @Override
    public void setValue(FakeFood annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        target.set(data, faker.resolve(annotation.value().getFakerKey()));
    }
}