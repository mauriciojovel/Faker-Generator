package faker.generator;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
public @interface FakeCode {
    FakeCodeType value() default FakeCodeType.IS_BN_GS1;
}
