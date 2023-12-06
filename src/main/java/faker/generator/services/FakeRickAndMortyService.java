package faker.generator.services;

import net.datafaker.Faker;
import faker.generator.FakeRickAndMorty;

import java.lang.reflect.Field;

public class FakeRickAndMortyService implements FakeService<FakeRickAndMorty> {
    @Override
    public void setValue(FakeRickAndMorty annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        target.set(data, faker.resolve(annotation.value().getFakerKey()));
    }
}
