package faker.generator;

import faker.generator.services.FakeDragonBallService;
import faker.generator.services.FakeServiceName;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
@FakeServiceName(FakeDragonBallService.class)
public @interface FakeDragonBall {
    FakeDragonBallType value() default FakeDragonBallType.CHARACTER;
}
