package faker.generator;

import faker.generator.services.FakeFriendsService;
import faker.generator.services.FakeServiceName;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
@FakeServiceName(FakeFriendsService.class)
public @interface FakeFriends {
    FakeFriendsType value() default FakeFriendsType.CHARACTER;
}
