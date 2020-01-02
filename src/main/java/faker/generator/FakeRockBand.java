package faker.generator;

import faker.generator.services.FakeRockBandService;
import faker.generator.services.FakeServiceName;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
@FakeServiceName(FakeRockBandService.class)
public @interface FakeRockBand {
    FakeRockBandType value() default FakeRockBandType.NAME;
}
