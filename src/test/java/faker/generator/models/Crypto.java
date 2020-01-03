package faker.generator.models;

import faker.generator.FakeCrypto;
import faker.generator.FakeCryptoType;
import lombok.Data;

@Data
public class Crypto {
    @FakeCrypto(FakeCryptoType.MD5)
    private String md5;

    @FakeCrypto(FakeCryptoType.SHA1)
    private String sha1;

    @FakeCrypto(FakeCryptoType.SHA256)
    private String sha256;

    @FakeCrypto(FakeCryptoType.SHA512)
    private String sha512;
}