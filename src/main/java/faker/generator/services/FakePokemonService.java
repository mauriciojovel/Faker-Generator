package faker.generator.services;

import com.github.javafaker.Faker;
import faker.generator.FakePokemon;

import java.lang.reflect.Field;

public class FakePokemonService implements FakeService<FakePokemon> {
    @Override
    public void setValue(FakePokemon annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        target.set(data, faker.resolve(annotation.value().getFakerKey()));
    }
}
