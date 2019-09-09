package faker.generator.models;

import faker.generator.FakePhoneNumber;
import faker.generator.FakePhoneNumberType;
import lombok.Data;

@Data
public class PhoneNumber {

    @FakePhoneNumber(FakePhoneNumberType.CELLPHONE)
    private String cellPhone;

    @FakePhoneNumber
    private String phoneNumber;
}
