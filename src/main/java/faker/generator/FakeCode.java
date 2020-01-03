package faker.generator;

import faker.generator.services.FakeCodeService;
import faker.generator.services.FakeServiceName;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
@FakeServiceName(FakeCodeService.class)
public @interface FakeCode {
    FakeCodeType value() default FakeCodeType.IS_BN_GS1;
}