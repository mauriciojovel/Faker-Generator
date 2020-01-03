package faker.generator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FakeCodeType {
    IS_BN_GS1, IS_BN_GROUP, IS_BN_REGISTRANT, IS_BN_10, IS_BN_13, E_AN_8, E_AN_13;
}
