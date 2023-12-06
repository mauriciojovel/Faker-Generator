package faker.generator.services;

import net.datafaker.Faker;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * Single service to implement all the services on the faker
 * @param <T> annotation to expect.
 */
public interface FakeService<T extends Annotation> {

    /**
     * Set the properties values.
     * @param annotation target annotation
     * @param target to set the properties value
     * @param data to set the value.
     * @param faker the faker.
     */
    void setValue(T annotation, Field target, Object data, Faker faker) throws IllegalAccessException;
}
