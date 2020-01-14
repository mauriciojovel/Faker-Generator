package faker.generator.services;

import com.github.javafaker.Faker;
import faker.generator.*;

import java.lang.reflect.Field;

public class FakeOptionsService implements FakeService<FakeOptions> {
    @Override
    public void setValue(FakeOptions annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        target.set(data, faker.options().option(annotation.value()));
    }
}