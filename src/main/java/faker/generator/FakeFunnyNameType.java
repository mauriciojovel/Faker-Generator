package faker.generator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FakeFunnyNameType {
    NAME("funny_name.name");
    private String fakerKey;
}
