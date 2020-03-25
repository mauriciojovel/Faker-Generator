package faker.generator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FakeFinanceType {
    CREDIT_CARD, BIC, IBAN;
}