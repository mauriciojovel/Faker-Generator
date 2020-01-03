package faker.generator;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import faker.generator.FakerGen;
import faker.generator.models.Stock;
import org.junit.Test;

import java.util.Optional;

public class StockTest {

    @Test
    public void testStock() {
        Optional<Stock> s = FakerGen.create(Stock.class);
        assertTrue(s.isPresent());
        s.ifPresent(so -> {
            assertNotNull(so.getNsdqSymbol());
            assertNotNull(so.getNyseSymbol());
        });
    }
}
