package faker.generator.test;

import faker.generator.FakerGen;
import faker.generator.models.Friends;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class FriendsTest {

    @Test
    public void testFriends() {
        Optional<Friends> f = FakerGen.create(Friends.class);
        assertTrue(f.isPresent());
        f.ifPresent(fo -> {
            assertNotNull(fo.getCharacter());
            assertNotNull(fo.getLocation());
            assertNotNull(fo.getQuote());
        });
    }
}
