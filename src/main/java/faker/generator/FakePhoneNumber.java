package faker.generator;

import faker.generator.services.FakePhoneNumberService;
import faker.generator.services.FakeServiceName;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
@FakeServiceName(FakePhoneNumberService.class)
public @interface FakePhoneNumber {
  FakePhoneNumberType value() default FakePhoneNumberType.PHONE_NUMBER;
}
