package faker.generator.models;

import faker.generator.FakeRockBand;
import faker.generator.FakeRockBandType;
import lombok.Data;

@Data
public class RockBand {

    @FakeRockBand(FakeRockBandType.NAME)
    private String name;
}