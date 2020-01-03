package faker.generator.models;

import faker.generator.FakeCode;
import faker.generator.FakeCodeType;
import lombok.Data;

@Data
public class Code {
    @FakeCode(FakeCodeType.IS_BN_GS1)
    private String isbnGs1;

    @FakeCode(FakeCodeType.IS_BN_GROUP)
    private String isbnGroup;

    @FakeCode(FakeCodeType.IS_BN_REGISTRANT)
    private String isbnRegistrant;

    @FakeCode(FakeCodeType.IS_BN_10)
    private String isbn10;

    @FakeCode(FakeCodeType.IS_BN_13)
    private String isbn13;

    @FakeCode(FakeCodeType.E_AN_8)
    private String ean8;

    @FakeCode(FakeCodeType.E_AN_13)
    private String ean13;
}