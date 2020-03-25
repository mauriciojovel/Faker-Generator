package faker.generator.models;

import faker.generator.FakeCommerce;
import faker.generator.FakeCommerceType;
import lombok.Data;

@Data
public class Commerce {
    @FakeCommerce(FakeCommerceType.COLOR)
    private String color;

    @FakeCommerce(FakeCommerceType.DEPARTMENT)
    private String department;

    @FakeCommerce(FakeCommerceType.MATERIAL)
    private String material;

    @FakeCommerce(FakeCommerceType.PRICE)
    private String price;

    @FakeCommerce(FakeCommerceType.PRODUCT_NAME)
    private String productName;

    @FakeCommerce(FakeCommerceType.PROMOTION_CODE)
    private String promotionCode;
}