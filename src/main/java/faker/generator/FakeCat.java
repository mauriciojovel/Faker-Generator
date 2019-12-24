package faker.generator;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
public @interface FakeCat {
    FakerCatType value() default FakerCatType.NAME;
}
