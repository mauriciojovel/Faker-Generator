package faker.generator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FakeHipsterType {
    WORD("hipster.words");
    private String fakerKey;
}
