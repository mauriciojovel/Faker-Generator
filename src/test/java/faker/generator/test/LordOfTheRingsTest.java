package faker.generator.test;

import faker.generator.FakerGen;
import faker.generator.models.LordOfTheRings;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class LordOfTheRingsTest {

    @Test
    public void testLordOfTheRings() {
        Optional<LordOfTheRings> lor = FakerGen.create(LordOfTheRings.class);
        assertTrue(lor.isPresent());
        lor.ifPresent(loro -> {
            assertNotNull(loro.getCharacter());
            assertNotNull(loro.getLocation());
        });
    }
}
