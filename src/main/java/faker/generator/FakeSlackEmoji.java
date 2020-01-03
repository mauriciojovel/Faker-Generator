package faker.generator;

import faker.generator.services.FakeServiceName;
import faker.generator.services.FakeSlackEmojiService;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
@FakeServiceName(FakeSlackEmojiService.class)
public @interface FakeSlackEmoji {
    FakeSlackEmojiType value() default FakeSlackEmojiType.EMOJI;
}