package faker.generator.services;

import net.datafaker.Faker;
import faker.generator.FakeHacker;

import java.lang.reflect.Field;

public class FakeHackerService implements FakeService<FakeHacker> {
    @Override
    public void setValue(FakeHacker annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        switch (annotation.value()) {
            case ABBREVIATION:
                target.set(data, faker.hacker().abbreviation());
                break;
            case NOUN:
                target.set(data, faker.hacker().noun());
                break;
            case ADJECTIVE:
                target.set(data, faker.hacker().adjective());
                break;
            case ING_VERB:
                target.set(data, faker.hacker().ingverb());
                break;
            case VERB:
                target.set(data, faker.hacker().verb());
                break;
        }
    }
}