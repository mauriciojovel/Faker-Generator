package faker.generator;

import faker.generator.services.FakeBookService;
import faker.generator.services.FakeServiceName;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
@FakeServiceName(FakeBookService.class)
public @interface FakeBook {
  FakeBookType value() default FakeBookType.TITLE;
}
