package faker.generator.models;

import faker.generator.FakeHacker;
import faker.generator.FakeHackerType;
import lombok.Data;

@Data
public class Hacker {
    @FakeHacker(FakeHackerType.ABBREVIATION)
    private String abbreviation;

    @FakeHacker(FakeHackerType.ADJECTIVE)
    private String adjective;

    @FakeHacker(FakeHackerType.ING_VERB)
    private String ingVerb;

    @FakeHacker(FakeHackerType.NOUN)
    private String noun;

    @FakeHacker(FakeHackerType.VERB)
    private String verb;
}
