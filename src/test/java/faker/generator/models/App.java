package faker.generator.models;

import faker.generator.FakeApp;
import faker.generator.FakeAppType;

import lombok.Data;

@Data
public class App {

  @FakeApp
  private String name;

  @FakeApp(FakeAppType.VERSION)
  private String version;

  @FakeApp(FakeAppType.AUTHOR)
  private String author;
}
