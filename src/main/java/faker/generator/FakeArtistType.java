package faker.generator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FakeArtistType {
  NAME("artist.names");

  private String fakerKey;
}
