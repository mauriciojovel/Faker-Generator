package faker.generator;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FakeHowIMetYourMotherType {
    CHARACTER("how_i_met_your_mother.character"), CATCHPHRASE("how_i_met_your_mother.catch_phrase"),
    HIGHFIVE("how_i_met_your_mother.high_five"), QUOTE("how_i_met_your_mother.quote");
    private String fakerKey;
}
