package faker.generator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FakeFriendsType {
    CHARACTER("friends.characters"), LOCATION("friends.locations"), QUOTE("friends.quotes");
    private String fakerKey;
}
