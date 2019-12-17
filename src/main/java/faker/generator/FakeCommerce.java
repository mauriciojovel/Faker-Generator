package faker.generator;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
public @interface FakeCommerce {
    FakeCommerceType value() default FakeCommerceType.PRODUCT_NAME;
}

