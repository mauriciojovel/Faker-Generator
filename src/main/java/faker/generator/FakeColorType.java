package faker.generator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FakeColorType {
    NAME("color.name");
    private String fakerKey;
}
