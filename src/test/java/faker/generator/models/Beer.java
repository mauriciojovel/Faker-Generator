package faker.generator.models;

import faker.generator.FakeBeer;
import faker.generator.FakeBeerType;
import lombok.Data;

@Data
public class Beer {

    @FakeBeer(FakeBeerType.NAME)
    private String name;

    @FakeBeer(FakeBeerType.STYLE)
    private String style;

    @FakeBeer(FakeBeerType.HOP)
    private String hop;

    @FakeBeer(FakeBeerType.YEAST)
    private String yeast;

    @FakeBeer(FakeBeerType.MALT)
    private String malt;

}