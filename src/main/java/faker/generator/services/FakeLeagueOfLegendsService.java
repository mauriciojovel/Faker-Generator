package faker.generator.services;

import com.github.javafaker.Faker;
import faker.generator.FakeLeagueOfLegends;
import java.lang.reflect.Field;

public class FakeLeagueOfLegendsService implements FakeService<FakeLeagueOfLegends> {
    @Override
    public void setValue(FakeLeagueOfLegends annotation, Field f, Object data, Faker faker) throws IllegalAccessException {
        f.set(data, faker.resolve(annotation.value().getFakerKey()));
    }
}
