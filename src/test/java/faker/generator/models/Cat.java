package faker.generator.models;

import faker.generator.FakeCat;
import faker.generator.FakerCatType;
import lombok.Data;

@Data
public class Cat {

    @FakeCat(FakerCatType.NAME)
    private String name;

    @FakeCat(FakerCatType.BREED)
    private String breed;

    @FakeCat(FakerCatType.REGISTRY)
    private String registry;
}
