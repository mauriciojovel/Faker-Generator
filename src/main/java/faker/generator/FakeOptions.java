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
    String[] value();
}