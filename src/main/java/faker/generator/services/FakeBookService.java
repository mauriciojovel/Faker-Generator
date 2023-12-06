package faker.generator.services;

import net.datafaker.Faker;
import faker.generator.FakeBook;

import java.lang.reflect.Field;

public class FakeBookService implements FakeService<FakeBook> {
    @Override
    public void setValue(FakeBook annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        switch (annotation.value()) {
            case GENRE:
                target.set(data, faker.book().genre());
                break;
            case TITLE:
                target.set(data, faker.book().title());
                break;
            case AUTHOR:
                target.set(data, faker.book().author());
                break;
            case PUBLISHER:
                target.set(data, faker.book().publisher());
                break;
        }
    }
}
