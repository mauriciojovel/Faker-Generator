package faker.generator.services;

import com.github.javafaker.Faker;
import com.github.javafaker.HarryPotter;
import faker.generator.FakeHarryPotter;

import java.lang.reflect.Field;

public class FakeHarryPotterService implements FakeService<FakeHarryPotter> {

    @Override
    public void setValue(FakeHarryPotter annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        target.set(data, faker.resolve(annotation.value().getFakerKey()));
    }
}
