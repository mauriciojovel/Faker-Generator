package faker.generator.services;

import net.datafaker.Faker;
import faker.generator.FakeApp;

import java.lang.reflect.Field;

public class FakeAppService implements FakeService<FakeApp> {
    @Override
    public void setValue(FakeApp annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        target.set(data, faker.resolve(annotation.value().getFakeKey()));
    }
}
