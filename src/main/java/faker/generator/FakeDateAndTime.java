package faker.generator;

import com.github.javafaker.DateAndTime;
import faker.generator.services.FakeDateAndTimeService;
import faker.generator.services.FakeServiceName;

import java.lang.annotation.*;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
@FakeServiceName(FakeDateAndTimeService.class)
public @interface FakeDateAndTime {
    FakeDateAndTimeType value() default FakeDateAndTimeType.FUTURE;
    int atMost() default Integer.MIN_VALUE;
    int minimum() default Integer.MIN_VALUE;
    TimeUnit unit() default TimeUnit.MINUTES;
    boolean referenceDate() default false;
    int difference() default 1;
    int minAge() default 18;
    int maxAge() default 65;
}
