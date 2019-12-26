package faker.generator;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
public @interface FakeFriends {
    FakeFriendsType value() default FakeFriendsType.CHARACTER;
}
