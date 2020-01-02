package faker.generator;

import faker.generator.services.FakeRickAndMortyService;
import faker.generator.services.FakeServiceName;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
@FakeServiceName(FakeRickAndMortyService.class)
public @interface FakeRickAndMorty {
    FakeRickAndMortyType value() default FakeRickAndMortyType.CHARACTER;
}
