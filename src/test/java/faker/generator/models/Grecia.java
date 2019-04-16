package faker.generator.models;

import faker.generator.FakeAncient;
import faker.generator.FakeAncientType;

import lombok.Data;

@Data
public class Grecia {
  @FakeAncient
  private String god;

  @FakeAncient(FakeAncientType.PRIMORDIAL)
  private String primordial;

  @FakeAncient(FakeAncientType.TITAN)
  private String titan;

  @FakeAncient(FakeAncientType.HERO)
  private String hero;
}
