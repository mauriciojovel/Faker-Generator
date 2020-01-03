package faker.generator.models;

import faker.generator.FakeEsportsType;
import faker.generator.FakeEsports;
import lombok.Data;

@Data
public class Esports {

    @FakeEsports(FakeEsportsType.PLAYER)
    private String player;

    @FakeEsports(FakeEsportsType.TEAM)
    private String team;

    @FakeEsports(FakeEsportsType.EVENT)
    private String event;

    @FakeEsports(FakeEsportsType.LEAGUE)
    private String league;

    @FakeEsports(FakeEsportsType.GAME)
    private String game;
}
