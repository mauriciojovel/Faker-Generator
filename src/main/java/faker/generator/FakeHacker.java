package faker.generator;

import faker.generator.services.FakeHackerService;
import faker.generator.services.FakeServiceName;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
@FakeServiceName(FakeHackerService.class)
public @interface FakeHacker {
    FakeHackerType value() default FakeHackerType.NOUN;
}