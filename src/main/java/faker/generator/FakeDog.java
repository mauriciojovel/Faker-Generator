package faker.generator;

import faker.generator.services.FakeDogService;
import faker.generator.services.FakeServiceName;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
@FakeServiceName(FakeDogService.class)
public @interface FakeDog {
    FakeDogType value() default FakeDogType.NAME;
}