package faker.generator.models;

import faker.generator.FakeInternet;
import faker.generator.FakeInternetType;
import java.util.UUID;
import lombok.Data;

@Data
public class Internet {
    @FakeInternet(FakeInternetType.EMAIL)
    private String email;

    @FakeInternet(value = FakeInternetType.EMAIL, isEmailSafe = true)
    private String safeEmail;

    @FakeInternet(value = FakeInternetType.EMAIL, isEmailSafe = true, localPart = "local")
    private String localSafeEmail;

    @FakeInternet(value = FakeInternetType.EMAIL, localPart = "local")
    private String localEmail;

    @FakeInternet(FakeInternetType.DOMAIN_NAME)
    private String domainName;

    @FakeInternet(FakeInternetType.DOMAIN_WORD)
    private String domainWord;

    @FakeInternet(FakeInternetType.DOMAIN_SUFFIX)
    private String domainSuffix;

    @FakeInternet(FakeInternetType.URL)
    private String url;

    @FakeInternet(FakeInternetType.AVATAR)
    private String avatar;

    @FakeInternet(FakeInternetType.IMAGE)
    private String image;

    @FakeInternet(value = FakeInternetType.IMAGE, imageWidth = 800, imageHeight = 600)
    private String image800x600;

    @FakeInternet(FakeInternetType.PASSWORD)
    private String password;

    @FakeInternet(FakeInternetType.MAC_ADDRESS)
    private String macAddress;

    @FakeInternet(FakeInternetType.IPV4)
    private String ipv4;

    @FakeInternet(FakeInternetType.PRIVATE_IPV4)
    private String privateIpv4;

    @FakeInternet(FakeInternetType.PUBLIC_IPV4)
    private String publicIpv4;

    @FakeInternet(FakeInternetType.IPV4_CIDR)
    private String ipv4Cird;

    @FakeInternet(FakeInternetType.IPV6)
    private String ipv6;

    @FakeInternet(FakeInternetType.IPV6_CIDR)
    private String ipv6Cird;

    @FakeInternet(FakeInternetType.SLUG)
    private String slug;

    @FakeInternet(value = FakeInternetType.SLUG, slugWords = {"hello", "world"})
    private String customSlug;

    @FakeInternet(FakeInternetType.UUID)
    private String uuid;

    @FakeInternet(FakeInternetType.UUID)
    private UUID uuidObject;
}
