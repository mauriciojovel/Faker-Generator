package faker.generator;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import faker.generator.models.File;
import java.util.Optional;
import org.junit.jupiter.api.Test;

class FileTest {

    @Test
    void testFile() {
        Optional<File> f = FakerGen.create(File.class);
        assertTrue(f.isPresent());
        f.ifPresent(fo -> {
            assertNotNull(fo.getExtension());
            assertNotNull(fo.getMimeType());
            assertNotNull(fo.getFileName());
        });
    }
}
