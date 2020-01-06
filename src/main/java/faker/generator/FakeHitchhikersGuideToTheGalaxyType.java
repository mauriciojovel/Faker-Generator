package faker.generator;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FakeHitchhikersGuideToTheGalaxyType {
    CHARACTER("hitchhikers_guide_to_the_galaxy.characters"), LOCATION("hitchhikers_guide_to_the_galaxy.locations"), MARVINQUOTE("hitchhikers_guide_to_the_galaxy.marvin_quote"), PLANET("hitchhikers_guide_to_the_galaxy.planets"),QUOTE("hitchhikers_guide_to_the_galaxy.quotes"), SPECIE("hitchhikers_guide_to_the_galaxy.species"),STARSHIP("hitchhikers_guide_to_the_galaxy.starships");
    private String fakerKey;
}
