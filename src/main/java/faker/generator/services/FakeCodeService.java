package faker.generator.services;

import com.github.javafaker.Faker;
import faker.generator.FakeCode;

import java.lang.reflect.Field;

public class FakeCodeService implements FakeService<FakeCode> {
    @Override
    public void setValue(FakeCode annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        switch (annotation.value()) {
            case IS_BN_GS1:
                target.set(data, faker.code().isbnGs1());
                break;
            case IS_BN_GROUP:
                target.set(data, faker.code().isbnGroup());
                break;
            case IS_BN_REGISTRANT:
                target.set(data, faker.code().isbnRegistrant());
                break;
            case IS_BN_10:
                target.set(data, faker.code().isbn10());
                break;
            case IS_BN_13:
                target.set(data, faker.code().isbn13());
                break;
            case E_AN_8:
                target.set(data, faker.code().ean8());
                break;
            case E_AN_13:
                target.set(data, faker.code().ean13());
                break;
        }
    }
}
