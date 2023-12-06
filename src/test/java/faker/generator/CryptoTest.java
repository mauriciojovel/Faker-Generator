package faker.generator;

import faker.generator.models.Crypto;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CryptoTest {
    @Test
    void testCrypto() {
        Optional<Crypto> c = FakerGen.create(Crypto.class);
        assertTrue(c.isPresent());
        c.ifPresent( cr -> {
            assertNotNull(cr.getMd5());
            assertNotNull(cr.getSha1());
            assertNotNull(cr.getSha256());
            assertNotNull(cr.getSha512());
        });
    }
}
