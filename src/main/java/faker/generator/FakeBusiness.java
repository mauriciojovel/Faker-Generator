package faker.generator;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
public @interface FakeBusiness {
  FakeBusinessType value() default FakeBusinessType.CREDIT_CARD_NUMBER;
}
