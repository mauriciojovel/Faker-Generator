package faker.generator.services;

import net.datafaker.Faker;
import faker.generator.FakeAvatar;

import java.lang.reflect.Field;

public class FakeAvatarService implements FakeService<FakeAvatar> {
    @Override
    public void setValue(FakeAvatar annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        target.set(data, faker.avatar().image());
    }
}
