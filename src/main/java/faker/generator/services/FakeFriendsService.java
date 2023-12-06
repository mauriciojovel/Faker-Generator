package faker.generator.services;

import net.datafaker.Faker;
import faker.generator.FakeFriends;

import java.lang.reflect.Field;

public class FakeFriendsService implements FakeService<FakeFriends> {

    @Override
    public void setValue(FakeFriends annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        target.set(data, faker.resolve(annotation.value().getFakerKey()));
    }
}
