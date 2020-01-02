package faker.generator;

import faker.generator.services.FakeEsportsService;
import faker.generator.services.FakeServiceName;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
@FakeServiceName(FakeEsportsService.class)
public @interface FakeEsports {
    FakeEsportsType value() default FakeEsportsType.PLAYER;
}
