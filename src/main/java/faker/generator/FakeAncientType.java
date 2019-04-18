package faker.generator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FakeAncientType {
  GOD("ancient.god"), PRIMORDIAL("ancient.primordial"), TITAN("ancient.titan"), HERO("ancient.hero");

  private String fakerKey;
}
