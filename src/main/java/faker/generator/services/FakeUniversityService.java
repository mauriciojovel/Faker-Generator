package faker.generator.services;

import com.github.javafaker.Faker;
import faker.generator.FakeUniversity;

import java.lang.reflect.Field;

public class FakeUniversityService implements FakeService<FakeUniversity> {
    @Override
    public void setValue(FakeUniversity annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        target.set(data, faker.resolve(annotation.value().getFakerKey()));
    }
}
