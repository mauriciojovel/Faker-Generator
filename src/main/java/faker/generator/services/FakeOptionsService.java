package faker.generator.services;

import net.datafaker.Faker;
import faker.generator.*;

import java.lang.reflect.Field;
import java.util.Arrays;

public class FakeOptionsService implements FakeService<FakeOptions> {
    @Override
    public void setValue(FakeOptions annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        if (annotation.stringOptions().length > 0){
            target.set(data, faker.options().option(annotation.stringOptions()));
        } else if (annotation.intOptions().length > 0){
            target.set(data, faker.options().option((Arrays.stream(annotation.intOptions()).boxed()).toArray(Integer[]::new)));
        } else if (annotation.doubleOptions().length > 0){
            target.set(data, faker.options().option((Arrays.stream(annotation.doubleOptions()).boxed()).toArray(Double[]::new)));
        }
    }
}