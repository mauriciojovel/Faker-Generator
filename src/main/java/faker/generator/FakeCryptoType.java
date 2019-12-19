package faker.generator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FakeCryptoType {
    MD5, SHA1, SHA256, SHA512;
}