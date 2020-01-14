package faker.generator.models;

import faker.generator.FakeOptions;
import lombok.Data;

@Data
public class Options {
    @FakeOptions(value = {"MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY"})
    private String days;
}