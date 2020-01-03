package faker.generator.models;

import faker.generator.FakeFile;
import faker.generator.FakeFileType;
import lombok.Data;

@Data
public class File {
    @FakeFile(value = FakeFileType.EXTENSION)
    private String extension;

    @FakeFile(value = FakeFileType.MIME_TYPE)
    private String mimeType;

    @FakeFile(value = FakeFileType.FILE_NAME)
    private String fileName;
}
