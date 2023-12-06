package faker.generator.services;

import faker.generator.FakeBothify;
import net.datafaker.Faker;
import java.lang.reflect.Field;

public class FakeBothifyService implements FakeService<FakeBothify> {

    @Override
    public void setValue(FakeBothify annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        target.set(data, faker.bothify(annotation.value(), annotation.isUpperCase()));
    }
}
