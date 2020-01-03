package faker.generator;

import faker.generator.services.FakeIdNumberService;
import faker.generator.services.FakeServiceName;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
@FakeServiceName(FakeIdNumberService.class)
public @interface FakeIdNumber {
    FakeIdNumberType value() default  FakeIdNumberType.VALID_NUMBER;
}