package faker.generator.services;

import com.github.javafaker.Faker;
import faker.generator.FakeCommerce;

import java.lang.reflect.Field;

public class FakeCommerceService implements FakeService<FakeCommerce> {
    @Override
    public void setValue(FakeCommerce annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        switch (annotation.value()) {
            case COLOR:
                target.set(data, faker.commerce().color());
                break;
            case DEPARTMENT:
                target.set(data, faker.commerce().department());
                break;
            case PRODUCT_NAME:
                target.set(data, faker.commerce().productName());
                break;
            case MATERIAL:
                target.set(data, faker.commerce().material());
                break;
            case PRICE:
                target.set(data, faker.commerce().price());
                break;
            case PROMOTION_CODE:
                target.set(data, faker.commerce().promotionCode());
                break;
        }
    }
}
