package faker.generator;

import faker.generator.models.Dog;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DogTest {
    @Test
    void dogTest() {
        Optional<Dog> d = FakerGen.create(Dog.class);
        assertTrue(d.isPresent());
        d.ifPresent(dog -> {
            assertNotNull(dog.getName());
            assertNotNull(dog.getBreed());
            assertNotNull(dog.getSound());
            assertNotNull(dog.getMemePhrase());
            assertNotNull(dog.getAge());
            assertNotNull(dog.getCoatLength());
            assertNotNull(dog.getGender());
            assertNotNull(dog.getSize());
        });
    }
}