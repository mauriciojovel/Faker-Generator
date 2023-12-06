package faker.generator.services;

import net.datafaker.Faker;
import faker.generator.FakeFinance;

import java.lang.reflect.Field;

public class FakeFinanceService implements FakeService<FakeFinance> {
    @Override
    public void setValue(FakeFinance annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        switch (annotation.value()) {
            case CREDIT_CARD:
                target.set(data, faker.finance().creditCard());
                break;
            case BIC:
                target.set(data, faker.finance().bic());
                break;
            case IBAN:
                target.set(data, faker.finance().iban());
                break;
        }
    }
}