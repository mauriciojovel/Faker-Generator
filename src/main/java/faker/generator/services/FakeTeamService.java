package faker.generator.services;

import net.datafaker.Faker;
import faker.generator.FakeTeam;

import java.lang.reflect.Field;

public class FakeTeamService implements FakeService<FakeTeam> {
    @Override
    public void setValue(FakeTeam annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        switch (annotation.value()) {
            case NAME:
                target.set(data, faker.team().name());
                break;
            case CREATURE:
                target.set(data, faker.team().creature());
                break;
            case STATE:
                target.set(data, faker.team().state());
                break;
            case SPORT:
                target.set(data, faker.team().sport());
        }
    }
}
