package faker.generator.services;

import com.github.javafaker.Faker;
import faker.generator.FakeSuperhero;

import java.lang.reflect.Field;

public class FakeSuperheroService implements FakeService<FakeSuperhero> {
    @Override
    public void setValue(FakeSuperhero annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        target.set(data, faker.resolve(annotation.value().getFakerKey()));
    }
}