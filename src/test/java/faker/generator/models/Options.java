package faker.generator.models;

import faker.generator.FakeOptions;
import lombok.Data;

@Data
public class Options {
    @FakeOptions(stringOptions = {"MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY"})
    private String stringOptions;

    @FakeOptions(intOptions = {1,2,3,4,5,6,7,8,9,10})
    private Integer intOptions;

    @FakeOptions(doubleOptions = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6 ,7.7, 8.8, 9.9, 10.10})
    private Double doubleOptions;
}