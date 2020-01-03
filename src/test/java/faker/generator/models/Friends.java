package faker.generator.models;

import faker.generator.FakeFriends;
import faker.generator.FakeFriendsType;
import lombok.Data;

@Data
public class Friends {

    @FakeFriends(FakeFriendsType.CHARACTER)
    private String character;

    @FakeFriends(FakeFriendsType.LOCATION)
    private String location;

    @FakeFriends(FakeFriendsType.QUOTE)
    private String quote;
}
