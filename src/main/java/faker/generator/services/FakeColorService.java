package faker.generator.services;

import com.github.javafaker.Faker;
import faker.generator.FakeColor;

import java.lang.reflect.Field;

public class FakeColorService implements FakeService<FakeColor> {
    @Override
    public void setValue(FakeColor annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        target.set(data, faker.color().name());
    }
}
