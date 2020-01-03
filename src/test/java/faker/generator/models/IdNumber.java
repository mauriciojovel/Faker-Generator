package faker.generator.models;

import faker.generator.FakeIdNumber;
import faker.generator.FakeIdNumberType;
import lombok.Data;

@Data
public class IdNumber {
    @FakeIdNumber(FakeIdNumberType.INVALID_NUMBER)
    private String invalidNumber;

    @FakeIdNumber(FakeIdNumberType.VALID_NUMBER)
    private String validNumber;
}