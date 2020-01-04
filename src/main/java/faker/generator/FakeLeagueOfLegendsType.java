package faker.generator;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FakeLeagueOfLegendsType {
    CHAMPION("games.league_of_legends.champion"), LOCATION("games.league_of_legends.location"), QUOTE("games.league_of_legends.quote"),
    SUMMONERSPELL("games.league_of_legends.summoner_spell"), MASTERIES("games.league_of_legends.masteries"), RANK("games.league_of_legends.rank");

    private String fakerKey;
}
