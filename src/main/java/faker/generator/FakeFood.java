package faker.generator;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
public @interface FakeFood {
    FakeFoodType value() default FakeFoodType.INGREDIENT;
}
