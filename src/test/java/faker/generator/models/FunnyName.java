package faker.generator.models;
import faker.generator.FakeFunnyName;
import faker.generator.FakeFunnyNameType;
import lombok.Data;

@Data
public class FunnyName {
    @FakeFunnyName(FakeFunnyNameType.NAME)
    private String name;
}
