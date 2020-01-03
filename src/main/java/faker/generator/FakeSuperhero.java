package faker.generator;

import faker.generator.services.FakeServiceName;
import faker.generator.services.FakeSuperheroService;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
@FakeServiceName(FakeSuperheroService.class)
public @interface FakeSuperhero {
    FakerSuperheroType value() default FakerSuperheroType.NAME;
}