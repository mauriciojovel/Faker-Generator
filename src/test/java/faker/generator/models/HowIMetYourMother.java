package faker.generator.models;

import faker.generator.FakeHowIMetYourMother;
import faker.generator.FakeHowIMetYourMotherType;
import lombok.Data;

@Data
public class HowIMetYourMother {

    @FakeHowIMetYourMother(FakeHowIMetYourMotherType.CHARACTER)
    private String character;

    @FakeHowIMetYourMother(FakeHowIMetYourMotherType.HIGHFIVE)
    private String highFive;

    @FakeHowIMetYourMother(FakeHowIMetYourMotherType.CATCHPHRASE)
    private String catchPhrase;

    @FakeHowIMetYourMother(FakeHowIMetYourMotherType.QUOTE)
    private String quote;
}
