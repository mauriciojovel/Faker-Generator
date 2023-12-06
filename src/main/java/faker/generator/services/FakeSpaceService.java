package faker.generator.services;

import net.datafaker.Faker;
import faker.generator.FakeSpace;

import java.lang.reflect.Field;

public class FakeSpaceService implements FakeService<FakeSpace> {
    @Override
    public void setValue(FakeSpace annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        target.set(data, faker.resolve(annotation.value().getFakerKey()));
    }
}