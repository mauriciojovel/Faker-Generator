package faker.generator.services;

import com.github.javafaker.Faker;
import faker.generator.FakeStarTrek;

import java.lang.reflect.Field;

public class FakeStarTrekService implements FakeService<FakeStarTrek> {
    @Override
    public void setValue(FakeStarTrek annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        switch (annotation.value()) {
            case CHARACTER:
                target.set(data, faker.starTrek().character());
                break;
            case LOCATION:
                target.set(data, faker.starTrek().location());
                break;
            case SPECIE:
                target.set(data, faker.starTrek().specie());
                break;
            case VILLAIN:
                target.set(data, faker.starTrek().villain());
        }
    }
}
