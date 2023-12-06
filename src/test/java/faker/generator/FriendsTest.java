package faker.generator;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import faker.generator.models.Friends;
import java.util.Optional;
import org.junit.jupiter.api.Test;

class FriendsTest {

    @Test
    void testFriends() {
        Optional<Friends> f = FakerGen.create(Friends.class);
        assertTrue(f.isPresent());
        f.ifPresent(fo -> {
            assertNotNull(fo.getCharacter());
            assertNotNull(fo.getLocation());
            assertNotNull(fo.getQuote());
        });
    }
}
