package faker.generator.services;

import com.github.javafaker.Faker;
import faker.generator.FakeDateAndTime;

import java.lang.reflect.Field;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;
import java.util.Optional;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class FakeDateAndTimeService implements FakeService<FakeDateAndTime> {
    private static int RANDOM_BOUND = 100;
    @Override
    public void setValue(FakeDateAndTime annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        Optional<TimeUnit> unit;
        switch (annotation.value()) {
            case FUTURE:
                unit = Optional.of(annotation.unit());
                if(annotation.atMost() > 0 && annotation.minimum() > 0 && unit.isPresent()) {
                    target.set(data, faker.date().future(annotation.atMost(), annotation.minimum(), unit.get()));
                }
                else if(annotation.atMost() > 0 && annotation.referenceDate() == true && unit.isPresent()){
                    Date referenceDate = new Date();
                    target.set(data, faker.date().future(annotation.atMost(), unit.get(), referenceDate));
                }
                else if(annotation.atMost() > 0 && unit.isPresent()) {
                    target.set(data, faker.date().future(annotation.atMost(), unit.get()));
                }
                else {
                    Random random = new Random();
                    int atMost = random.nextInt(RANDOM_BOUND) + 1;
                    target.set(data, faker.date().future(atMost, unit.get()));
                }
                break;
            case PAST:
                unit = Optional.of(annotation.unit());
                if(annotation.atMost() > 0 && annotation.minimum() > 0 && unit.isPresent()) {
                    target.set(data, faker.date().past(annotation.atMost(), annotation.minimum(), unit.get()));
                }
                else if(annotation.atMost() > 0 && annotation.referenceDate() == true && unit.isPresent()){
                    Date referenceDate = new Date();
                    target.set(data, faker.date().past(annotation.atMost(), unit.get(), referenceDate));
                }
                else if(annotation.atMost() > 0 && unit.isPresent()) {
                    target.set(data, faker.date().past(annotation.atMost(), unit.get()));
                }
                else {
                    Random random = new Random();
                    int atMost = random.nextInt(RANDOM_BOUND) + 1;
                    target.set(data, faker.date().past(atMost, unit.get()));
                }
                break;
            case BETWEEN:
                Random random = new Random();
                int difference = annotation.difference() > 0? annotation.difference() : random.nextInt(RANDOM_BOUND) + 1;
                Instant now = Instant.now();
                Instant before = now.minus(Duration.ofDays(difference));
                Date to = Date.from(now);
                Date from = Date.from(before);
                target.set(data, faker.date().between(from, to));
                break;
            case BIRTHDAY:
                target.set(data, faker.date().birthday());
                break;
        }
    }
}
