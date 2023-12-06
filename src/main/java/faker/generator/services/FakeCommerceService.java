package faker.generator.services;

import net.datafaker.Faker;
import faker.generator.FakeCommerce;

import java.lang.reflect.Field;

public class FakeCommerceService implements FakeService<FakeCommerce> {
    @Override
    public void setValue(FakeCommerce annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        switch (annotation.value()) {
            case BRAND:
                target.set(data, faker.commerce().brand());
                break;
            case VENDOR:
                target.set(data, faker.commerce().vendor());
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
