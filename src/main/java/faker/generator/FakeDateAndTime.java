package faker.generator;

import faker.generator.services.FakeDateAndTimeService;
import faker.generator.services.FakeServiceName;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
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
