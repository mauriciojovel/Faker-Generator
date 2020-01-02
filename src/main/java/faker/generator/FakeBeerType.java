package faker.generator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FakeBeerType {
    NAME("beer.name"), STYLE("beer.style"), HOP("beer.hop"), YEAST("beer.yeast"), MALT("beer.malt");
    private String fakerKey;
}