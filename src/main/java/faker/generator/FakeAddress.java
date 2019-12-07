package faker.generator;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
public @interface FakeAddress {
  FakeAddressType value() default FakeAddressType.FULL_ADDRESS;
  boolean includeSecondary() default false;
  String stateAbbr() default "";
  String postCode() default  "";
}
