package faker.generator;

import faker.generator.FakerGen;
import faker.generator.models.Beer;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class BeerTest {

    @Test
    public void testBeer() {
        Optional<Beer> b = FakerGen.create(Beer.class);
        assertTrue(b.isPresent());
        b.ifPresent(bo -> {
            assertNotNull(bo.getName());
            assertNotNull(bo.getStyle());
            assertNotNull(bo.getHop());
            assertNotNull(bo.getYeast());
            assertNotNull(bo.getMalt());
        });
    }

}
