package faker.generator.services;

import com.github.javafaker.Faker;
import faker.generator.FakeName;

import java.lang.reflect.Field;

public class FakeNameService implements FakeService<FakeName> {
    @Override
    public void setValue(FakeName annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        switch (annotation.value()) {
            case NAME:
                target.set(data, faker.name().name());
                break;
            case TITLE:
                target.set(data, faker.name().title());
                break;
            case PREFIX:
                target.set(data, faker.name().prefix());
                break;
            case SUFFIX:
                target.set(data, faker.name().suffix());
                break;
            case FULL_NAME:
                target.set(data, faker.name().fullName());
                break;
            case LAST_NAME:
                target.set(data, faker.name().lastName());
                break;
            case FIRST_NAME:
                target.set(data, faker.name().firstName());
                break;
            case NAME_WITH_MIDDLE:
                target.set(data, faker.name().nameWithMiddle());
                break;
            case USERNAME:
                target.set(data, faker.name().username());
                break;
        }
    }
}
