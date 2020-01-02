package faker.generator.services;

import com.github.javafaker.Faker;
import faker.generator.FakeBusiness;

import java.lang.reflect.Field;

public class FakeBusinessService implements FakeService<FakeBusiness> {
    @Override
    public void setValue(FakeBusiness annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        switch (annotation.value()) {
            case CREDIT_CARD_TYPE:
                target.set(data, faker.business().creditCardType());
                break;
            case CREDIT_CARD_EXPIRY:
                target.set(data, faker.business().creditCardExpiry());
                break;
            case CREDIT_CARD_NUMBER:
                target.set(data, faker.business().creditCardNumber());
                break;
        }
    }
}
