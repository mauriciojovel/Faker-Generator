package faker.generator.services;

import com.github.javafaker.Faker;
import faker.generator.FakeBeer;

import java.lang.reflect.Field;

public class FakeBeerService implements FakeService<FakeBeer> {
    @Override
    public void setValue(FakeBeer annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        target.set(data, faker.resolve(annotation.value().getFakerKey()));
    }
}
