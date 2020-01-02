package faker.generator.models;

import faker.generator.FakeColor;
import lombok.Data;

@Data
public class Color {
    @FakeColor
    private String color;
}
