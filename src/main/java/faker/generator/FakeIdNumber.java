package faker.generator;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
public @interface FakeIdNumber {
    FakeIdNumberType value() default  FakeIdNumberType.VALID_NUMBER;
}