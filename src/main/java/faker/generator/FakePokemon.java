package faker.generator;

import faker.generator.services.FakePokemonService;
import faker.generator.services.FakeServiceName;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
@FakeServiceName(FakePokemonService.class)
public @interface FakePokemon {
  FakePokemonType value() default FakePokemonType.NAME;
}
