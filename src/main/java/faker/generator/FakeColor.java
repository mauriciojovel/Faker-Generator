package faker.generator;

import faker.generator.services.FakeColorService;
import faker.generator.services.FakeServiceName;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
@FakeServiceName(FakeColorService.class)
public @interface FakeColor {
}
