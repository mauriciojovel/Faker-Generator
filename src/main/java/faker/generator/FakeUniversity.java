package faker.generator;

import faker.generator.services.FakeServiceName;
import faker.generator.services.FakeUniversityService;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
@FakeServiceName(FakeUniversityService.class)
public @interface FakeUniversity {
    FakeUniversityType value() default FakeUniversityType.NAME;
}
