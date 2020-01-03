package faker.generator;

import faker.generator.services.FakeBeerService;
import faker.generator.services.FakeServiceName;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
@FakeServiceName(FakeBeerService.class)
public @interface FakeBeer {
    FakeBeerType value() default FakeBeerType.NAME;
}