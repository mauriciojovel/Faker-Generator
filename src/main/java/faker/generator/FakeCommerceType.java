package faker.generator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FakeCommerceType {
    DEPARTMENT("commerce.department"), PRODUCT_NAME("commerce.product_name.product"), MATERIAL("commerce.product_name.material"),
    PRICE(""), PROMOTION_CODE(""), VENDOR(""), BRAND("");
    private final String type;
}
