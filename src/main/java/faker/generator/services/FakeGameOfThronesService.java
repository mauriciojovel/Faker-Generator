package faker.generator.services;

import net.datafaker.Faker;
import faker.generator.FakeGameOfThrones;

import java.lang.reflect.Field;

public class FakeGameOfThronesService implements FakeService<FakeGameOfThrones> {
    @Override
    public void setValue(FakeGameOfThrones annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        target.set(data, faker.resolve(annotation.value().getFakerKey()));

    }
}