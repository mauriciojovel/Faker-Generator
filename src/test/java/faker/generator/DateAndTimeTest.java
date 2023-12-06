package faker.generator;

import faker.generator.models.DateAndTime;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DateAndTimeTest {

    @Test
    void testDateAndTime() {
        Optional<DateAndTime> d = FakerGen.create(DateAndTime.class);
        assertTrue(d.isPresent());
        d.ifPresent(dto -> {
            assertNotNull(dto.getFuture());
            assertNotNull(dto.getFutureWithParams());
            assertNotNull(dto.getPast());
            assertNotNull(dto.getPastWithParams());
            assertNotNull(dto.getBetween());
            assertNotNull(dto.getBetweenWithParams());
            assertNotNull(dto.getBirthday());
            assertNotNull(dto.getZonedDateTimeBetween());
            assertNotNull(dto.getLocalDateBirthday());
            assertNotNull(dto.getLocalDateTimePastWithParams());
            assertNotNull(dto.getInstantPast());
        });
    }
}
