package faker.generator.services;
import net.datafaker.Faker;
import faker.generator.FakeYoda;

import java.lang.reflect.Field;

public class FakeYodaService implements FakeService<FakeYoda> {
    @Override
    public void setValue(FakeYoda annotation, Field f, Object data, Faker faker) throws IllegalAccessException {
        f.set(data, faker.resolve(annotation.value().getFakerKey()));
    }
}
