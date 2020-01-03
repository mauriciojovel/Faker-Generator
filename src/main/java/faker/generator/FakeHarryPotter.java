package faker.generator;

import faker.generator.services.FakeHarryPotterService;
import faker.generator.services.FakeServiceName;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
@FakeServiceName(FakeHarryPotterService.class)
public @interface FakeHarryPotter {
    FakeHarryPotterType value() default FakeHarryPotterType.CHARACTER;
}
