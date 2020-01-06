package faker.generator.models;

import faker.generator.FakeHobbit;
import faker.generator.FakeHobbitType;
import lombok.Data;

@Data
public class Hobbit {
    @FakeHobbit(FakeHobbitType.CHARACTER)
    private String character;

    @FakeHobbit(FakeHobbitType.LOCATION)
    private String location;

    @FakeHobbit(FakeHobbitType.QUOTE)
    private String quote;

    @FakeHobbit(FakeHobbitType.THORINSCOMPANY)
    private String thorinsCompany;
}
