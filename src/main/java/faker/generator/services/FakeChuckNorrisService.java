package faker.generator.services;

import net.datafaker.Faker;
import faker.generator.FakeChuckNorris;

import java.lang.reflect.Field;

public class FakeChuckNorrisService implements FakeService<FakeChuckNorris> {
    @Override
    public void setValue(FakeChuckNorris annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        target.set(data, faker.chuckNorris().fact());
    }
}
