package faker.generator;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import faker.generator.FakerGen;
import faker.generator.models.Stock;
import org.junit.jupiter.api.Test;

import java.util.Optional;

class StockTest {

    @Test
    void testStock() {
        Optional<Stock> s = FakerGen.create(Stock.class);
        assertTrue(s.isPresent());
        s.ifPresent(so -> {
            assertNotNull(so.getNsdqSymbol());
            assertNotNull(so.getNyseSymbol());
        });
    }
}
