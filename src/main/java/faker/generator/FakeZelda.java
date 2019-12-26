package faker.generator;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
public @interface FakeZelda {
    FakeZeldaType value() default FakeZeldaType.GAME;
}
