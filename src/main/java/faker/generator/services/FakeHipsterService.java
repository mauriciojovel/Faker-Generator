package faker.generator.services;

import net.datafaker.Faker;
import faker.generator.FakeHipster;

import java.lang.reflect.Field;

public class FakeHipsterService implements FakeService<FakeHipster> {

    @Override
    public void setValue(FakeHipster annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        switch (annotation.value()) {
            case WORD:
                target.set(data, faker.hipster().word());
                break;
        }
    }
}
