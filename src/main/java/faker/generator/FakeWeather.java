package faker.generator;

import faker.generator.services.FakeServiceName;
import faker.generator.services.FakeWeatherService;

import java.lang.annotation.*;

@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
@FakeServiceName(FakeWeatherService.class)
public @interface FakeWeather {
    FakerWeatherType value() default FakerWeatherType.DESCRIPTION;
}
