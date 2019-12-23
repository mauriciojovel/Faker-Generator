package faker.generator;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
public @interface FakeFinance {
    FakeFinanceType value() default FakeFinanceType.CREDIT_CARD;
}