package faker.generator;

import faker.generator.services.FakeAncientService;
import faker.generator.services.FakeService;
import faker.generator.services.FakeServiceName;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
@FakeServiceName(FakeAncientService.class)
public @interface FakeAncient {
  FakeAncientType value() default FakeAncientType.GOD;
}
