package faker.generator;

import faker.generator.services.FakeChuckNorrisService;
import faker.generator.services.FakeServiceName;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
@FakeServiceName(FakeChuckNorrisService.class)
public @interface FakeChuckNorris {

}
