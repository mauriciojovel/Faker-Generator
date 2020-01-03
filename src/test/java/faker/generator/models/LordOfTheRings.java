package faker.generator.models;

import faker.generator.FakeLordOfTheRings;
import faker.generator.FakeLordOfTheRingsType;
import lombok.Data;

@Data
public class LordOfTheRings {

    @FakeLordOfTheRings(FakeLordOfTheRingsType.CHARACTER)
    private String character;

    @FakeLordOfTheRings(FakeLordOfTheRingsType.LOCATION)
    private String location;
}
