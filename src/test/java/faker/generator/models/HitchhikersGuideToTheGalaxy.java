package faker.generator.models;
import faker.generator.FakeHitchhikersGuideToTheGalaxy;
import faker.generator.FakeHitchhikersGuideToTheGalaxyType;
import lombok.Data;

@Data
public class HitchhikersGuideToTheGalaxy {

    @FakeHitchhikersGuideToTheGalaxy(FakeHitchhikersGuideToTheGalaxyType.CHARACTER)
    private String character;

    @FakeHitchhikersGuideToTheGalaxy(FakeHitchhikersGuideToTheGalaxyType.LOCATION)
    private String location;

    @FakeHitchhikersGuideToTheGalaxy(FakeHitchhikersGuideToTheGalaxyType.MARVINQUOTE)
    private String marvinQuote;

    @FakeHitchhikersGuideToTheGalaxy(FakeHitchhikersGuideToTheGalaxyType.PLANET)
    private String planet;

    @FakeHitchhikersGuideToTheGalaxy(FakeHitchhikersGuideToTheGalaxyType.QUOTE)
    private String quote;

    @FakeHitchhikersGuideToTheGalaxy(FakeHitchhikersGuideToTheGalaxyType.SPECIE)
    private String specie;

    @FakeHitchhikersGuideToTheGalaxy(FakeHitchhikersGuideToTheGalaxyType.STARSHIP)
    private String starShip;

}
