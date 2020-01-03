package faker.generator;

import faker.generator.services.FakeFoodService;
import faker.generator.services.FakeServiceName;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
@FakeServiceName(FakeFoodService.class)
public @interface FakeFood {
    FakeFoodType value() default FakeFoodType.INGREDIENT;
}