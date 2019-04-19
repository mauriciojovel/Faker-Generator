package faker.generator.models;

import faker.generator.FakeAvatar;

import lombok.Data;

@Data
public class Avatar {
  @FakeAvatar
  private String image;
}
