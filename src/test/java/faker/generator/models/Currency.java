package faker.generator.models;

import faker.generator.FakeCurrency;
import faker.generator.FakeCurrencyType;
import lombok.Data;

@Data
public class Currency {
    @FakeCurrency(FakeCurrencyType.CODE)
    private String code;

    @FakeCurrency(FakeCurrencyType.NAME)
    private String name;
}
