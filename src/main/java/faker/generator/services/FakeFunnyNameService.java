package faker.generator.services;

import com.github.javafaker.Faker;
import faker.generator.FakeFunnyName;
import java.lang.reflect.Field;

public class FakeFunnyNameService implements FakeService<FakeFunnyName> {
    @Override
    public void setValue(FakeFunnyName annotation, Field f, Object data, Faker faker) throws IllegalAccessException {
        f.set(data, faker.resolve(annotation.value().getFakerKey()));
    }
}
