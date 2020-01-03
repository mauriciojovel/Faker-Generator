package faker.generator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FakeHackerType {
    ABBREVIATION("hacker.abbreviation"), ADJECTIVE("hacker.adjective"), NOUN("hacker.noun"),
    VERB("hacker.verb"), ING_VERB("hacker.ingverb");
    private String fakerKey;
}
