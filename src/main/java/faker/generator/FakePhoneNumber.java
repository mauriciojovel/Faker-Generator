package faker.generator;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
public @interface FakePhoneNumber {
  FakePhoneNumberType value() default FakePhoneNumberType.PHONE_NUMBER;
}
