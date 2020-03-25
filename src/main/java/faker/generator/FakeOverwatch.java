package faker.generator;

import faker.generator.services.FakeOverwatchService;
import faker.generator.services.FakeServiceName;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
@FakeServiceName(FakeOverwatchService.class)
public @interface FakeOverwatch {
    FakeOverwatchType value() default FakeOverwatchType.HERO;
}
