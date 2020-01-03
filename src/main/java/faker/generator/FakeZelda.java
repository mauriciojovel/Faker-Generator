package faker.generator;

import faker.generator.services.FakeServiceName;
import faker.generator.services.FakeZeldaService;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
@FakeServiceName(FakeZeldaService.class)
public @interface FakeZelda {
    FakeZeldaType value() default FakeZeldaType.GAME;
}
