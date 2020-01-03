package faker.generator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FakeCatType {
    NAME("creature.cat.name"), BREED("creature.cat.breed"), REGISTRY("creature.cat.registry");
    private String fakerKey;
}
