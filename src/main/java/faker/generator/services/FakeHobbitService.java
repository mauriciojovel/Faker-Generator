package faker.generator.services;
import net.datafaker.Faker;
import faker.generator.FakeHobbit;
import java.lang.reflect.Field;

public class FakeHobbitService implements FakeService<FakeHobbit> {
    @Override
    public void setValue(FakeHobbit annotation, Field f, Object data, Faker faker) throws IllegalAccessException {
        f.set(data, faker.resolve(annotation.value().getFakerKey()));
    }
}
