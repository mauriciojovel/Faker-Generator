package faker.generator.models;

import faker.generator.FakeTwinPeaks;
import faker.generator.FakeTwinPeaksType;
import lombok.Data;

@Data
public class TwinPeaks {

    @FakeTwinPeaks(FakeTwinPeaksType.CHARACTER)
    private String character;

    @FakeTwinPeaks(FakeTwinPeaksType.LOCATION)
    private String location;

    @FakeTwinPeaks(FakeTwinPeaksType.QUOTE)
    private String quote;
}
