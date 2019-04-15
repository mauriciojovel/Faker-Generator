package faker.generator.models;

import faker.generator.FakeName;
import faker.generator.FakeNameType;

import lombok.Data;

@Data
public class Person {
  @FakeName
  private String name;

  @FakeName(FakeNameType.FIRST_NAME)
  private String firstName;

  @FakeName(FakeNameType.LAST_NAME)
  private String lastName;

  @FakeName(FakeNameType.PREFIX)
  private String prefix;

  @FakeName(FakeNameType.SUFFIX)
  private String suffix;

  @FakeName(FakeNameType.TITLE)
  private String title;

  @FakeName(FakeNameType.FULL_NAME)
  private String fullName;

  @FakeName(FakeNameType.NAME_WITH_MIDDLE)
  private String nameWithMiddle;

  private Doctor doctor;

  private People people;
}
