package faker.generator.models;

import faker.generator.FakeBusiness;
import faker.generator.FakeBusinessType;
import lombok.Data;

@Data
public class Business {
    @FakeBusiness
    private String creditCardNumber;

    @FakeBusiness(FakeBusinessType.CREDIT_CARD_TYPE)
    private String creditCardType;

    @FakeBusiness(FakeBusinessType.CREDIT_CARD_EXPIRY)
    private String creditCardExpiry;
}
