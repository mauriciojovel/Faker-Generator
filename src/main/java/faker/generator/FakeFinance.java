package faker.generator;

import faker.generator.services.FakeFinanceService;
import faker.generator.services.FakeServiceName;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
@FakeServiceName(FakeFinanceService.class)
public @interface FakeFinance {
    FakeFinanceType value() default FakeFinanceType.CREDIT_CARD;
}