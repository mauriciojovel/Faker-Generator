package faker.generator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FakeCompanyType {
    NAME("company.name"), SUFFIX("company.suffix"), INDUSTRY("company.industry"), PROFESSION("company.profession"),
    BUZZ_WORD("company.buzzwords"), BS("company.bs"), LOGO(""), URL("");
    private String fakerKey;
}
