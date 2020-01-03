package faker.generator;

import faker.generator.models.Finance;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class FinanceTest {
    @Test
    public void financeTest() {
        Optional<Finance> f = FakerGen.create(Finance.class);
        assertTrue(f.isPresent());
        f.ifPresent(fi -> {
            assertNotNull(fi.getCreditCard());
            assertNotNull(fi.getBic());
            assertNotNull(fi.getIban());
        });
    }
}
