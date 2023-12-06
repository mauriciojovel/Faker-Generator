package faker.generator.services;

import net.datafaker.Faker;
import faker.generator.FakeCompany;

import java.lang.reflect.Field;

public class FakeCompanyService implements FakeService<FakeCompany> {
    @Override
    public void setValue(FakeCompany annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        switch (annotation.value()) {
            case BS:
                target.set(data, faker.company().bs());
                break;
            case BUZZ_WORD:
                target.set(data, faker.company().buzzword());
                break;
            case INDUSTRY:
                target.set(data, faker.company().industry());
                break;
            case LOGO:
                target.set(data, faker.company().logo());
                break;
            case NAME:
                target.set(data, faker.company().name());
                break;
            case PROFESSION:
                target.set(data, faker.company().profession());
                break;
            case SUFFIX:
                target.set(data, faker.company().suffix());
                break;
            case URL:
                target.set(data, faker.company().url());
                break;
        }
    }
}
