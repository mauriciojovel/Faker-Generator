package faker.generator.models;

import faker.generator.FakeMatz;
import faker.generator.FakeMatzType;
import lombok.Data;

@Data
public class Matz {
    @FakeMatz(FakeMatzType.QUOTE)
    private String quote;
}
