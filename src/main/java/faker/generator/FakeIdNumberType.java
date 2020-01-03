package faker.generator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FakeIdNumberType {
    VALID_NUMBER("id_number.valid"), INVALID_NUMBER("id_number.invalid");
    private String fakerKey;
}