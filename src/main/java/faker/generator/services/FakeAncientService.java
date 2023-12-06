package faker.generator.services;

import net.datafaker.Faker;
import faker.generator.FakeAncient;

import java.lang.reflect.Field;

public class FakeAncientService implements FakeService<FakeAncient> {
    @Override
    public void setValue(FakeAncient annotation, Field f, Object data, Faker faker) throws IllegalAccessException {
        f.set(data, faker.resolve(annotation.value().getFakerKey()));
    }
}
