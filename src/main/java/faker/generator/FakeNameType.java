package faker.generator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FakeNameType {
  NAME("name.name"), FIRST_NAME("name.first_name"),
  FULL_NAME("name.full_name"), LAST_NAME("name.last_name"),
  NAME_WITH_MIDDLE("name.name_with_middle"), PREFIX("name.prefix"),
  SUFFIX("name.suffix"), TITLE("name.title"), USERNAME("name.username");

  private String fakerKey;
}
