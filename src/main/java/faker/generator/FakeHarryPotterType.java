package faker.generator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FakeHarryPotterType {
    CHARACTER("harry_potter.characters"), LOCATION("harry_potter.locations"), QUOTE("harry_potter.quotes"), BOOK("harry_potter.books");
    private String fakerKey;
}
