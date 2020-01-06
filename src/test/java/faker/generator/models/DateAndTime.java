package faker.generator.models;

import faker.generator.FakeDateAndTime;
import faker.generator.FakeDateAndTimeType;
import lombok.Data;

import java.util.Date;
import java.util.concurrent.TimeUnit;

@Data
public class DateAndTime {
    @FakeDateAndTime
    private Date future;

    @FakeDateAndTime(atMost = 50, unit = TimeUnit.HOURS)
    private Date futureWithParams;

    @FakeDateAndTime(value = FakeDateAndTimeType.PAST)
    private Date past;

    @FakeDateAndTime(value = FakeDateAndTimeType.PAST, atMost = 50, unit = TimeUnit.HOURS)
    private Date pastWithParams;

    @FakeDateAndTime(FakeDateAndTimeType.BETWEEN)
    private Date between;

    @FakeDateAndTime(value = FakeDateAndTimeType.BETWEEN, difference = 5)
    private Date betweenWithParams;

    @FakeDateAndTime(FakeDateAndTimeType.BIRTHDAY)
    private Date birthday;
}
