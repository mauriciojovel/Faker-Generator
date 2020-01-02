package faker.generator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FakeRockBandType {
    NAME("rock_band.name");
    private String fakerKey;
}
