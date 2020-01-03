package faker.generator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FakeGameOfThronesType {
    CHARACTER("game_of_thrones.characters"), HOUSES("game_of_thrones.houses"), CITIES("game_of_thrones.cities"),
    DRAGONS("game_of_thrones.dragons"), QUOTES("game_of_thrones.quotes");
    private String fakerKey;
}