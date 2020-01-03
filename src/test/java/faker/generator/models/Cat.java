package faker.generator.models;

import faker.generator.FakeCat;
import faker.generator.FakeCatType;
import lombok.Data;

@Data
public class Cat {

    @FakeCat(FakeCatType.NAME)
    private String name;

    @FakeCat(FakeCatType.BREED)
    private String breed;

    @FakeCat(FakeCatType.REGISTRY)
    private String registry;
}
