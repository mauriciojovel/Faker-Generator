package faker.generator.services;

import com.github.javafaker.Faker;
import faker.generator.FakeEsports;

import java.lang.reflect.Field;

public class FakeEsportsService implements FakeService<FakeEsports> {

    @Override
    public void setValue(FakeEsports annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        target.set(data, faker.resolve(annotation.value().getFakerKey()));
    }
}
