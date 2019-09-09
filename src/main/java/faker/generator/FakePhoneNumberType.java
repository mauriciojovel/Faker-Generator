package faker.generator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FakePhoneNumberType {

  PHONE_NUMBER("phone_number.formats"), CELLPHONE( "cell_phone.formats" );

  private String fakerKey;
}
