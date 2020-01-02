package faker.generator;

import faker.generator.services.FakeLebowskiService;
import faker.generator.services.FakeServiceName;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
@FakeServiceName(FakeLebowskiService.class)
public @interface FakeLebowski {
    FakeLebowskiType value() default FakeLebowskiType.ACTOR;

}
