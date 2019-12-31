package faker.generator;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
public @interface FakeOverwatch {
    FakeOverwatchType value() default FakeOverwatchType.HERO;
}
