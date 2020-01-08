package faker.generator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FakeYodaType {

    QUOTE("yoda.quotes");

    private String fakerKey;
}
