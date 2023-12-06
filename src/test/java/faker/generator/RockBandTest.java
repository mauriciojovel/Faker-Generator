package faker.generator;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import faker.generator.models.RockBand;
import java.util.Optional;
import org.junit.jupiter.api.Test;

class RockBandTest {

    @Test
    void testRockBand() {
        Optional<RockBand> r = FakerGen.create(RockBand.class);
        assertTrue(r.isPresent());
        r.ifPresent(ro -> {
            assertNotNull(ro.getName());
        });
    }
}
