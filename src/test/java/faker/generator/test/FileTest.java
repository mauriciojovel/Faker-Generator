package faker.generator.test;

import faker.generator.FakerGen;
import faker.generator.models.File;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class FileTest {

    @Test
    public void testFile() {
        Optional<File> f = FakerGen.create(File.class);
        assertTrue(f.isPresent());
        f.ifPresent(fo -> {
            assertNotNull(fo.getExtension());
            assertNotNull(fo.getMimeType());
            assertNotNull(fo.getFileName());
        });
    }
}
