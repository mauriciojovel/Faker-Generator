package faker.generator.models;

import faker.generator.FakeFinance;
import faker.generator.FakeFinanceType;
import lombok.Data;

@Data
public class Finance {
    @FakeFinance
    private String creditCard;

    @FakeFinance(FakeFinanceType.BIC)
    private String bic;

    @FakeFinance(FakeFinanceType.IBAN)
    private String iban;
}
