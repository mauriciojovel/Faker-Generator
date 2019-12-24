package faker.generator;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
public @interface FakeUniversity {
    FakeUniversityType value() default FakeUniversityType.NAME;
}
