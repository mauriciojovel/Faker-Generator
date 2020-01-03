package faker.generator.models;

import faker.generator.FakeHarryPotter;
import faker.generator.FakeHarryPotterType;
import lombok.Data;

@Data
public class HarryPotter {

    @FakeHarryPotter(FakeHarryPotterType.CHARACTER)
    private String character;

    @FakeHarryPotter(FakeHarryPotterType.LOCATION)
    private String location;

    @FakeHarryPotter(FakeHarryPotterType.QUOTE)
    private String quote;

    @FakeHarryPotter(FakeHarryPotterType.BOOK)
    private String book;
}
