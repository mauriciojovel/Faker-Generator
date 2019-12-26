package faker.generator;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
public @interface FakeHarryPotter {
    FakeHarryPotterType value() default FakeHarryPotterType.CHARACTER;
}
