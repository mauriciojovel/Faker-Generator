package faker.generator;

import faker.generator.services.FakeLordOfTheRingsService;
import faker.generator.services.FakeServiceName;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
@FakeServiceName(FakeLordOfTheRingsService.class)
public @interface FakeLordOfTheRings {
    FakeLordOfTheRingsType value() default FakeLordOfTheRingsType.CHARACTER;
}
