package faker.generator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FakeWitcherType {
    CHARACTER("games.witcher.characters"), WITCHER("games.witcher.witchers"), SCHOOL("games.witcher.schools"),
    LOCATION("games.witcher.locations"), QUOTE("games.witcher.quotes"),MONSTER("games.witcher.monsters");

    private String fakerKey;
}
