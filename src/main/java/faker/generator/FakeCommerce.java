package faker.generator;

import faker.generator.services.FakeCommerceService;
import faker.generator.services.FakeServiceName;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
@FakeServiceName(FakeCommerceService.class)
public @interface FakeCommerce {
    FakeCommerceType value() default FakeCommerceType.PRODUCT_NAME;
}

