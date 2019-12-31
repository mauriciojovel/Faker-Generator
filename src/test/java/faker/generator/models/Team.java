package faker.generator.models;

import faker.generator.FakeTeam;
import faker.generator.FakeTeamType;
import lombok.Data;

@Data
public class Team {

    @FakeTeam(FakeTeamType.NAME)
    private String name;

    @FakeTeam(FakeTeamType.CREATURE)
    private String creature;

    @FakeTeam(FakeTeamType.STATE)
    private String state;

    @FakeTeam(FakeTeamType.SPORT)
    private String sport;
}
