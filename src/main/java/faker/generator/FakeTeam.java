package faker.generator;

import faker.generator.services.FakeServiceName;
import faker.generator.services.FakeTeamService;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
@FakeServiceName(FakeTeamService.class)
public @interface FakeTeam {
    FakeTeamType value() default FakeTeamType.NAME;
}
