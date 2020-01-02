package faker.generator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FakeZeldaType {
    GAME("games.zelda.games"), CHARACTER("games.zelda.characters");
    private String fakerKey;
}
