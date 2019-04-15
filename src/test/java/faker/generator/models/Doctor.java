package faker.generator.models;

import faker.generator.FakeNewInstance;

import lombok.Data;

@Data
public class Doctor {

  @FakeNewInstance
  private Person person;

}
