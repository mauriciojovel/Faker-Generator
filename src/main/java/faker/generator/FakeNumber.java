package faker.generator;

import faker.generator.services.FakeNumberService;
import faker.generator.services.FakeServiceName;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
@FakeServiceName(FakeNumberService.class)
public @interface FakeNumber {
  FakeNumberType value() default FakeNumberType.RANDOM_NUMBER;
  int minValue() default -1;
  int maxValue() default -1;
  int maxNumberOfDecimal() default -1;
  boolean strict() default false;
  int count() default -1;
}
