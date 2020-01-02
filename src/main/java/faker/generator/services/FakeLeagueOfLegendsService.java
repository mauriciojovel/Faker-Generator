package faker.generator.services;

import com.github.javafaker.Faker;
import faker.generator.FakeLeagueOfLegends;
import java.lang.reflect.Field;

public class FakeLeagueOfLegendsService implements FakeService<FakeLeagueOfLegends> {

    @Override
    public void setValue(FakeLeagueOfLegends annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        switch (annotation.value()) {
            case CHAMPION:
                target.set(data, faker.leagueOfLegends().champion());
                break;
            case LOCATION:
                target.set(data, faker.leagueOfLegends().location());
                break;
            case QUOTE:
                target.set(data, faker.leagueOfLegends().quote());
                break;
            case MASTERIES:
                target.set(data, faker.leagueOfLegends().masteries());
                break;
            case RANK:
                target.set(data, faker.leagueOfLegends().rank());
                break;
            case SUMMONERSPELL:
                target.set(data, faker.leagueOfLegends().summonerSpell());
                break;
        }
    }
}
