package faker.generator.models;

import faker.generator.FakeZelda;
import faker.generator.FakeZeldaType;
import lombok.Data;

@Data
public class Zelda {

    @FakeZelda(FakeZeldaType.GAME)
    private String game;

    @FakeZelda(FakeZeldaType.CHARACTER)
    private String character;
}
