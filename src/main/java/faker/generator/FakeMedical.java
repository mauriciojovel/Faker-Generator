package faker.generator;

import faker.generator.services.FakeMedicalService;
import faker.generator.services.FakeServiceName;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
@FakeServiceName(FakeMedicalService.class)
public @interface FakeMedical {
    FakeMedicalType value() default FakeMedicalType.MEDICINE;

}
