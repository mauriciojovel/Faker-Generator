package faker.generator;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
public @interface FakeNumber {
  FakeNumberType value() default FakeNumberType.RANDOM_NUMBER;
  int minValue() default -1;
  int maxValue() default -1;
  int maxNumberOfDecimal() default -1;
  boolean strict() default false;
  int count() default -1;
}
