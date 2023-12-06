package faker.generator.services;
import net.datafaker.Faker;
import faker.generator.FakeWitcher;

import java.lang.reflect.Field;
public class FakeWitcherService implements FakeService<FakeWitcher>{
    @Override
    public void setValue(FakeWitcher annotation, Field f, Object data, Faker faker) throws IllegalAccessException {
        f.set(data, faker.resolve(annotation.value().getFakerKey()));
    }
}
