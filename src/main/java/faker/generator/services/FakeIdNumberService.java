package faker.generator.services;

import com.github.javafaker.Faker;
import faker.generator.FakeIdNumber;

import java.lang.reflect.Field;

public class FakeIdNumberService implements FakeService<FakeIdNumber> {
    @Override
    public void setValue(FakeIdNumber annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        target.set(data, faker.resolve(annotation.value().getFakerKey()));
    }
}