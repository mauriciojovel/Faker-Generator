package faker.generator;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import faker.generator.models.LordOfTheRings;


import java.util.Optional;
import org.junit.jupiter.api.Test;


class LordOfTheRingsTest {

    @Test
    void testLordOfTheRings() {
        Optional<LordOfTheRings> lor = FakerGen.create(LordOfTheRings.class);
        assertTrue(lor.isPresent());
        lor.ifPresent(loro -> {
            assertNotNull(loro.getCharacter());
            assertNotNull(loro.getLocation());
        });
    }
}
