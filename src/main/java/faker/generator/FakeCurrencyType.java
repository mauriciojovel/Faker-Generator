package faker.generator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FakeCurrencyType {
    NAME("currency.name"), CODE("currency.code");
    private String fakerKey;
}
