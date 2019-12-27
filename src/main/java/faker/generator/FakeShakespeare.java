package faker.generator;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
public @interface FakeShakespeare {
    FakeShakespeareType value() default FakeShakespeareType.HAMLET_QUOTE;
}