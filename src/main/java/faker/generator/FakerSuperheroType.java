package faker.generator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FakerSuperheroType {
    NAME("superhero.name"), PREFIX("superhero.prefix"), SUFFIX("superhero.suffix"), POWER("superhero.power"),
    DESCRIPTOR("superhero.descriptor");
    private String fakerKey;
}
