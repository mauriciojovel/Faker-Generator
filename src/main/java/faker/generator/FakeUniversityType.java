package faker.generator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FakeUniversityType {
    NAME("university.name"), PREFIX("university.prefix"), SUFFIX("university.suffix");
    private String fakerKey;
}
