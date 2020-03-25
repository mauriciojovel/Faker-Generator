package faker.generator;

import faker.generator.services.FakeAddressService;
import faker.generator.services.FakeServiceName;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@FakeServiceName(FakeAddressService.class)
public @interface FakeAddress {
  FakeAddressType value() default FakeAddressType.FULL_ADDRESS;
  boolean includeSecondary() default false;
  String stateAbbr() default "";
  String postCode() default  "";
}
