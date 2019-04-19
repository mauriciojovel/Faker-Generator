package faker.generator.models;

import faker.generator.FakeArtist;

import lombok.Data;

@Data
public class Artist {
  @FakeArtist
  private String name;
}
