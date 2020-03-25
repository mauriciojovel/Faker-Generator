package faker.generator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FakePokemonType {

  NAME("games.pokemon.names"), LOCATION( "games.pokemon.locations" );

  private String fakerKey;
}
