package faker.generator.services;

import net.datafaker.Faker;
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
            case KLINGON:
                target.set(data, faker.starTrek().klingon());
                break;
            case SPECIE:
                target.set(data, faker.starTrek().species());
                break;
            case VILLAIN:
                target.set(data, faker.starTrek().villain());
        }
    }
}
