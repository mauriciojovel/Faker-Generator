package faker.generator;

import faker.generator.services.FakeOptionsService;
import faker.generator.services.FakeServiceName;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
@FakeServiceName(FakeOptionsService.class)
public @interface FakeOptions {
    FakeOptionsType value() default FakeOptionsType.YEAR;
    int minDay() default 1;
    int maxDay() default 31;
    FakeOptionsMonths months() default FakeOptionsMonths.JANUARY;
    int minYear() default 1900;
    int maxYear() default 2020;
    String[] days() default {"MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY"};
}