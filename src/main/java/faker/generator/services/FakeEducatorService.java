package faker.generator.services;

import com.github.javafaker.Educator;
import com.github.javafaker.Faker;
import faker.generator.FakeEducator;

import java.lang.reflect.Field;

public class FakeEducatorService implements FakeService<FakeEducator> {
    @Override
    public void setValue(FakeEducator annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        switch (annotation.value()) {
            case UNIVERSITY:
                target.set(data, faker.educator().university());
                break;
            case COURSE:
                target.set(data, faker.educator().course());
                break;
            case SECONDARY_SCHOOL:
                target.set(data, faker.educator().secondarySchool());
                break;
            case CAMPUS:
                target.set(data, faker.educator().campus());
                break;
        }
    }
}
