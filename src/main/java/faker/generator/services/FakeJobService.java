package faker.generator.services;

import com.github.javafaker.Faker;
import faker.generator.FakeJob;

import java.lang.reflect.Field;

public class FakeJobService implements FakeService<FakeJob> {

    @Override
    public void setValue(FakeJob annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        switch (annotation.value()) {
            case FIELD:
                target.set(data, faker.job().field());
                break;
            case SENIORITY:
                target.set(data, faker.job().seniority());
                break;
            case POSITION:
                target.set(data, faker.job().position());
                break;
            case KEY_SKILLS:
                target.set(data, faker.job().keySkills());
                break;
            case TITLE:
                target.set(data, faker.job().title());
                break;
        }
    }
}