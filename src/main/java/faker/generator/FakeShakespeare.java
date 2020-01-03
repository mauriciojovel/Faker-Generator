package faker.generator;

import faker.generator.services.FakeServiceName;
import faker.generator.services.FakeShakespeareService;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
@FakeServiceName(FakeShakespeareService.class)
public @interface FakeShakespeare {
    FakeShakespeareType value() default FakeShakespeareType.HAMLET_QUOTE;
}