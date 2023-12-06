package faker.generator.services;

import net.datafaker.Faker;
import faker.generator.FakeCat;

import java.lang.reflect.Field;

public class FakeCatService implements FakeService<FakeCat> {

    @Override
    public void setValue(FakeCat annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        target.set(data, faker.resolve(annotation.value().getFakerKey()));
    }
}
