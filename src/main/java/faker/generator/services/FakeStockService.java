package faker.generator.services;

import com.github.javafaker.Faker;
import faker.generator.FakeStock;

import java.lang.reflect.Field;

public class FakeStockService implements FakeService<FakeStock> {
    @Override
    public void setValue(FakeStock annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        target.set(data, faker.resolve(annotation.value().getFakerKey()));
    }
}
