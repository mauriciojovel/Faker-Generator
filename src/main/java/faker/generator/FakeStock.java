package faker.generator;

import faker.generator.services.FakeServiceName;
import faker.generator.services.FakeStockService;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
@FakeServiceName(FakeStockService.class)
public @interface FakeStock {
    FakeStockType value() default FakeStockType.NSDQ;
}