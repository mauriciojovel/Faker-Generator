package faker.generator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FakeFileType {
    EXTENSION, MIME_TYPE, FILE_NAME;
}
