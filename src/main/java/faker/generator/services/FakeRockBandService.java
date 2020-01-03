package faker.generator.services;

import com.github.javafaker.Faker;
import faker.generator.FakeRockBand;

import java.lang.reflect.Field;

public class FakeRockBandService implements FakeService<FakeRockBand> {

    @Override
    public void setValue(FakeRockBand annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        switch (annotation.value()) {
            case NAME:
                target.set(data, faker.rockBand().name());
                break;
        }
    }
}
