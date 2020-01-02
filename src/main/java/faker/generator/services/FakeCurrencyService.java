package faker.generator.services;

import com.github.javafaker.Faker;
import faker.generator.FakeCurrency;

import java.lang.reflect.Field;

public class FakeCurrencyService implements FakeService<FakeCurrency> {
    @Override
    public void setValue(FakeCurrency annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        target.set(data, faker.resolve(annotation.value().getFakerKey()));
    }
}
