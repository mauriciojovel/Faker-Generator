package faker.generator.models;

import faker.generator.FakeNewCollection;

import java.util.Collection;
import lombok.Data;

@Data
public class People {

  @FakeNewCollection(Person.class)
  Collection<Person> people;
}
