package faker.generator.test;

import faker.generator.FakerGen;
import faker.generator.models.Crypto;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class CryptoTest {
    @Test
    public void testCrypto() {
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
