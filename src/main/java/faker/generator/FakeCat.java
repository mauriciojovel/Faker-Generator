package faker.generator;

import faker.generator.services.FakeCatService;
import faker.generator.services.FakeServiceName;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
@FakeServiceName(FakeCatService.class)
public @interface FakeCat {
    FakeCatType value() default FakeCatType.NAME;
}
