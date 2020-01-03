package faker.generator.models;

import faker.generator.FakeCompany;
import faker.generator.FakeCompanyType;
import lombok.Data;

@Data
public class Company {
    @FakeCompany(FakeCompanyType.BS)
    private String bs;

    @FakeCompany(FakeCompanyType.BUZZ_WORD)
    private String buzzWord;

    @FakeCompany(FakeCompanyType.INDUSTRY)
    private String industry;

    @FakeCompany(FakeCompanyType.LOGO)
    private String logo;

    @FakeCompany(FakeCompanyType.NAME)
    private String name;

    @FakeCompany(FakeCompanyType.PROFESSION)
    private String profession;

    @FakeCompany(FakeCompanyType.SUFFIX)
    private String suffix;

    @FakeCompany(FakeCompanyType.URL)
    private String url;
}
