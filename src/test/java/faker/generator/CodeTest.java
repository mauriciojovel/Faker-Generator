package faker.generator;

import faker.generator.models.Code;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CodeTest {
    @Test
    void codeTest() {
        Optional<Code> c = FakerGen.create(Code.class);
        assertTrue(c.isPresent());
        c.ifPresent(co -> {
            assertNotNull(co.getIsbnGs1());
            assertNotNull(co.getIsbnGroup());
            assertNotNull(co.getIsbnRegistrant());
            assertNotNull(co.getIsbn10());
            assertNotNull(co.getIsbn13());
            assertNotNull(co.getEan8());
            assertNotNull(co.getEan13());
        });
    }
}
