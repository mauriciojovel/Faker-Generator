package faker.generator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FakeAppType {
  NAME("app.name"), VERSION("app.version"), AUTHOR("app.author");

  private String fakeKey;
}
