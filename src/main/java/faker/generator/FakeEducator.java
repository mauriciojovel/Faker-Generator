package faker.generator;

import faker.generator.services.FakeEducatorService;
import faker.generator.services.FakeServiceName;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
@FakeServiceName(FakeEducatorService.class)
public @interface FakeEducator {
    FakeEducatorType value() default FakeEducatorType.COURSE;
}