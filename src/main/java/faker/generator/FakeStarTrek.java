package faker.generator;

import faker.generator.services.FakeServiceName;
import faker.generator.services.FakeStarTrekService;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
@FakeServiceName(FakeStarTrekService.class)
public @interface FakeStarTrek {
    FakeStarTrekType value() default FakeStarTrekType.CHARACTER;

}
