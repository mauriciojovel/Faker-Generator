package faker.generator;

import faker.generator.services.FakeBoolService;
import faker.generator.services.FakeServiceName;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
@FakeServiceName(FakeBoolService.class)
public @interface FakeBool { }
