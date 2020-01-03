package faker.generator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FakeEsportsType {
    PLAYER("esport.players"), TEAM("esport.teams"), EVENT("esport.events"), LEAGUE("esport.leagues"), GAME("esport.games");
    private String fakerKey;
}
