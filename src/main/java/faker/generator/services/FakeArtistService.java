package faker.generator.services;

import com.github.javafaker.Faker;
import faker.generator.FakeArtist;

import java.lang.reflect.Field;

public class FakeArtistService implements FakeService<FakeArtist> {
    @Override
    public void setValue(FakeArtist annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        target.set(data, faker.resolve(annotation.value().getFakerKey()));
    }
}
