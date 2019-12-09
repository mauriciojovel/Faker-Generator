package faker.generator.models;

import faker.generator.FakeChuckNorris;
import lombok.Data;

@Data
public class ChuckNorris {
    @FakeChuckNorris
    private String fact;
}
