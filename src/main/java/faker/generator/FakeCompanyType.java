package faker.generator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FakeCompanyType {
    NAME, SUFFIX, INDUSTRY, PROFESSION, BUZZ_WORD, BS, LOGO, URL;
}