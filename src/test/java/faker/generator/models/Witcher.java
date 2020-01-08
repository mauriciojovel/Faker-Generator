package faker.generator.models;
import faker.generator.FakeWitcher;
import faker.generator.FakeWitcherType;
import lombok.Data;

@Data
public class Witcher {
    @FakeWitcher(FakeWitcherType.CHARACTER)
    private String character;

    @FakeWitcher(FakeWitcherType.LOCATION)
    private String location;

    @FakeWitcher(FakeWitcherType.MONSTER)
    private String monster;

    @FakeWitcher(FakeWitcherType.QUOTE)
    private String quote;

    @FakeWitcher(FakeWitcherType.SCHOOL)
    private String school;

    @FakeWitcher(FakeWitcherType.WITCHER)
    private String witcher;
}
