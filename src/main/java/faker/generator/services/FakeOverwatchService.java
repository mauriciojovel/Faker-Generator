package faker.generator.services;

import com.github.javafaker.Faker;
import faker.generator.FakeOverwatch;

import java.lang.reflect.Field;

public class FakeOverwatchService implements FakeService<FakeOverwatch> {
    @Override
    public void setValue(FakeOverwatch annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        switch (annotation.value()) {
            case HERO:
                target.set(data, faker.overwatch().hero());
                break;
            case LOCATION:
                target.set(data, faker.overwatch().location());
                break;
            case QUOTE:
                target.set(data, faker.overwatch().quote());
                break;
        }
    }
}
