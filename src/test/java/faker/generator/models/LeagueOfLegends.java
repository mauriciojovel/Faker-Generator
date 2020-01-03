package faker.generator.models;

import faker.generator.FakeLeagueOfLegends;
import faker.generator.FakeLeagueOfLegendsType;
import lombok.Data;

@Data
public class LeagueOfLegends {

    @FakeLeagueOfLegends(FakeLeagueOfLegendsType.CHAMPION)
    private String champion;

    @FakeLeagueOfLegends(FakeLeagueOfLegendsType.LOCATION)
    private String location;

    @FakeLeagueOfLegends(FakeLeagueOfLegendsType.MASTERIES)
    private String masteries;

    @FakeLeagueOfLegends(FakeLeagueOfLegendsType.QUOTE)
    private String quote;

    @FakeLeagueOfLegends(FakeLeagueOfLegendsType.RANK)
    private String rank;

    @FakeLeagueOfLegends(FakeLeagueOfLegendsType.SUMMONERSPELL)
    private String summonerSpell;
}
