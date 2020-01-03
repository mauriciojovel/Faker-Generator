package faker.generator;

import faker.generator.services.FakeServiceName;
import faker.generator.services.FakeSpaceService;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
@FakeServiceName(FakeSpaceService.class)
public @interface FakeSpace {
    FakeSpaceType value() default FakeSpaceType.GALAXY;
}
