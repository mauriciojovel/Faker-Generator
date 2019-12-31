package faker.generator;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
public @interface FakeStarTrek {
    FakeStarTrekType value() default FakeStarTrekType.CHARACTER;

}
