package faker.generator;

import faker.generator.services.FakeHipsterService;
import faker.generator.services.FakeServiceName;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
@FakeServiceName(FakeHipsterService.class)
public @interface FakeHipster {
    FakeHipsterType value() default FakeHipsterType.WORD;
}
