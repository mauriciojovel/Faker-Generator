package faker.generator;

import faker.generator.services.FakeCurrencyService;
import faker.generator.services.FakeServiceName;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
@FakeServiceName(FakeCurrencyService.class)
public @interface FakeCurrency {
    FakeCurrencyType value() default FakeCurrencyType.CODE;
}
