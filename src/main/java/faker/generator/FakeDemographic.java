package faker.generator;

import faker.generator.services.FakeDemographicService;
import faker.generator.services.FakeServiceName;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
@FakeServiceName(FakeDemographicService.class)
public @interface FakeDemographic {
    FakeDemographicType value() default FakeDemographicType.DEMONYM;
}