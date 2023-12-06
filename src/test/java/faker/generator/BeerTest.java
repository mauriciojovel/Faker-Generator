package faker.generator;

import faker.generator.models.Beer;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BeerTest {

    @Test
    void testBeer() {
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
