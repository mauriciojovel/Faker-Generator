package faker.generator.services;

import net.datafaker.Faker;
import faker.generator.FakeLordOfTheRings;

import java.lang.reflect.Field;

public class FakeLordOfTheRingsService implements FakeService<FakeLordOfTheRings> {

    @Override
    public void setValue(FakeLordOfTheRings annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        target.set(data, faker.resolve(annotation.value().getFakerKey()));
    }
}
