package faker.generator.services;

import net.datafaker.Faker;
import faker.generator.FakeDemographic;

import java.lang.reflect.Field;

public class FakeDemographicService implements FakeService<FakeDemographic> {
    @Override
    public void setValue(FakeDemographic annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        target.set(data, faker.resolve(annotation.value().getFakerKey()));
    }
}