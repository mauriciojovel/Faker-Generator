package faker.generator.services;
import com.github.javafaker.Faker;
import faker.generator.FakeHitchhikersGuideToTheGalaxy;
import java.lang.reflect.Field;

public class FakeHitchhikersGuideToTheGalaxyService implements FakeService<FakeHitchhikersGuideToTheGalaxy>{
    @Override
    public void setValue(FakeHitchhikersGuideToTheGalaxy annotation, Field f, Object data, Faker faker) throws IllegalAccessException {
        f.set(data, faker.resolve(annotation.value().getFakerKey()));
    }
}
