package faker.generator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FakeRickAndMortyType {
    CHARACTER("rick_and_morty.characters"), LOCATION("rick_and_morty.locations"), QUOTE("rick_and_morty.quotes");
    private String fakerKey;
}
