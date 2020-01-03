package faker.generator.services;

import com.github.javafaker.Faker;
import faker.generator.FakeDog;

import java.lang.reflect.Field;

public class FakeDogService implements FakeService<FakeDog> {
    @Override
    public void setValue(FakeDog annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        target.set(data, faker.resolve(annotation.value().getFakerKey()));
    }
}