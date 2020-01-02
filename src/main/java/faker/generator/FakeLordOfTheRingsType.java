package faker.generator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FakeLordOfTheRingsType {
    CHARACTER("lord_of_the_rings.characters"), LOCATION("lord_of_the_rings.locations");
    private String fakerKey;
}
