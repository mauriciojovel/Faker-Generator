package faker.generator.services;

import net.datafaker.Faker;
import faker.generator.FakeMatz;

import java.lang.reflect.Field;

public class FakeMatzService implements FakeService<FakeMatz> {
    @Override
    public void setValue(FakeMatz annotation, Field f, Object data, Faker faker) throws IllegalAccessException {
        f.set(data, faker.resolve(annotation.value().getFakerKey()));
    }
}
