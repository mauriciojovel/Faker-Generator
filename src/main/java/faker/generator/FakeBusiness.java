package faker.generator;

import faker.generator.services.FakeBusinessService;
import faker.generator.services.FakeServiceName;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
@FakeServiceName(FakeBusinessService.class)
public @interface FakeBusiness {
  FakeBusinessType value() default FakeBusinessType.CREDIT_CARD_NUMBER;
}
