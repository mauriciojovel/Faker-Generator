package faker.generator;

import faker.generator.services.FakeGameOfThronesService;
import faker.generator.services.FakeServiceName;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
@FakeServiceName(FakeGameOfThronesService.class)
public @interface FakeGameOfThrones {
    FakeGameOfThronesType value() default FakeGameOfThronesType.CHARACTER;
}