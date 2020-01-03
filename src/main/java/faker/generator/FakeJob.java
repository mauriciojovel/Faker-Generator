package faker.generator;

import faker.generator.services.FakeJobService;
import faker.generator.services.FakeServiceName;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
@FakeServiceName(FakeJobService.class)
public @interface FakeJob {
    FakeJobType value() default FakeJobType.FIELD;
}