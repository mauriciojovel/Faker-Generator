package faker.generator.services;
import com.github.javafaker.Faker;
import faker.generator.FakeDragonBall;

import java.lang.reflect.Field;

public class FakeDragonBallService implements FakeService<FakeDragonBall>{
    @Override
    public void setValue(FakeDragonBall annotation, Field f, Object data, Faker faker) throws IllegalAccessException {
        f.set(data, faker.resolve(annotation.value().getFakerKey()));
    }
}
