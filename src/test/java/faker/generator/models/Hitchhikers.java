package faker.generator.models;
import faker.generator.FakeHitchhikers;
import faker.generator.FakeHitchhikersType;
import lombok.Data;

@Data
public class Hitchhikers {

    @FakeHitchhikers(FakeHitchhikersType.CHARACTER)
    private String character;

    @FakeHitchhikers(FakeHitchhikersType.LOCATION)
    private String location;

    @FakeHitchhikers(FakeHitchhikersType.MARVINQUOTE)
    private String marvinQuote;

    @FakeHitchhikers(FakeHitchhikersType.PLANET)
    private String planet;

    @FakeHitchhikers(FakeHitchhikersType.QUOTE)
    private String quote;

    @FakeHitchhikers(FakeHitchhikersType.SPECIE)
    private String specie;

    @FakeHitchhikers(FakeHitchhikersType.STARSHIP)
    private String starShip;
}
