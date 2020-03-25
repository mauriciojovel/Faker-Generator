package faker.generator.services;

import com.github.javafaker.Faker;
import faker.generator.FakeRobin;

import java.lang.reflect.Field;

public class FakeRobinService implements FakeService<FakeRobin> {
    @Override
    public void setValue(FakeRobin annotation, Field f, Object data, Faker faker) throws IllegalAccessException {
        f.set(data, faker.resolve(annotation.value().getFakerKey()));
    }
}
