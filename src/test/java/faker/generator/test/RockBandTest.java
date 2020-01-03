package faker.generator.test;

import faker.generator.FakerGen;
import faker.generator.models.RockBand;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class RockBandTest {

    @Test
    public void testRockBand() {
        Optional<RockBand> r = FakerGen.create(RockBand.class);
        assertTrue(r.isPresent());
        r.ifPresent(ro -> {
            assertNotNull(ro.getName());
        });
    }
}
