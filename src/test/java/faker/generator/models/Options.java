package faker.generator.models;

import faker.generator.FakeOptions;
import faker.generator.FakeOptionsType;
import lombok.Data;

@Data
public class Options {
    @FakeOptions(FakeOptionsType.DAY)
    private String day;

    @FakeOptions(FakeOptionsType.MONTH)
    private String month;

    @FakeOptions(FakeOptionsType.YEAR)
    private String year;

    @FakeOptions(FakeOptionsType.DAY_OF_WEEK)
    private String dayOfWeek;
}