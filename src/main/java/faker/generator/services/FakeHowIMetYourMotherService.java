package faker.generator.services;

import net.datafaker.Faker;
import faker.generator.FakeHowIMetYourMother;

import java.lang.reflect.Field;
public class FakeHowIMetYourMotherService implements FakeService<FakeHowIMetYourMother> {
    @Override
    public void setValue(FakeHowIMetYourMother annotation, Field f, Object data, Faker faker) throws IllegalAccessException {
        f.set(data, faker.resolve(annotation.value().getFakerKey()));
    }
}
