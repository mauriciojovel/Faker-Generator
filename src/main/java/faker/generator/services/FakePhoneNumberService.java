package faker.generator.services;

import net.datafaker.Faker;
import faker.generator.FakePhoneNumber;

import java.lang.reflect.Field;

public class FakePhoneNumberService implements FakeService<FakePhoneNumber> {
    @Override
    public void setValue(FakePhoneNumber annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        target.set(data, faker.numerify(faker.resolve(annotation.value().getFakerKey())));
    }
}
