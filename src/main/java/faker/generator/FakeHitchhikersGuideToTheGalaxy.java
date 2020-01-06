package faker.generator;
import faker.generator.services.FakeHitchhikersGuideToTheGalaxyService;
import faker.generator.services.FakeService;
import faker.generator.services.FakeServiceName;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
@FakeServiceName(FakeHitchhikersGuideToTheGalaxyService.class)
public @interface FakeHitchhikersGuideToTheGalaxy {
    FakeHitchhikersGuideToTheGalaxyType value() default FakeHitchhikersGuideToTheGalaxyType.CHARACTER;
}
