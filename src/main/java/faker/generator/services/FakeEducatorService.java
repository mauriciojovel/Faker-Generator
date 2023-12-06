package faker.generator.services;

import faker.generator.FakeEducator;
import java.lang.reflect.Field;
import net.datafaker.Faker;

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
