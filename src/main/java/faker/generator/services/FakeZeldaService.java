package faker.generator.services;

import com.github.javafaker.Faker;
import faker.generator.FakeZelda;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class FakeZeldaService implements FakeService<FakeZelda> {

    @Override
    public void setValue(FakeZelda annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        target.set(data, faker.resolve(annotation.value().getFakerKey()));
    }
}
