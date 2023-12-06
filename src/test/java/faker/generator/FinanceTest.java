package faker.generator;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import faker.generator.models.Finance;
import java.util.Optional;
import org.junit.jupiter.api.Test;

class FinanceTest {
    @Test
    void financeTest() {
        Optional<Finance> f = FakerGen.create(Finance.class);
        assertTrue(f.isPresent());
        f.ifPresent(fi -> {
            assertNotNull(fi.getCreditCard());
            assertNotNull(fi.getBic());
            assertNotNull(fi.getIban());
        });
    }
}
