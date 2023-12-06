package faker.generator;

import faker.generator.models.SlackEmoji;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SlackEmojiTest {
    @Test
    void slackEmojiTest() {
        Optional<SlackEmoji> s = FakerGen.create(SlackEmoji.class);
        assertTrue(s.isPresent());
        s.ifPresent(sl -> {
            assertNotNull(sl.getPeople());
            assertNotNull(sl.getNature());
            assertNotNull(sl.getFoodAndDrink());
            assertNotNull(sl.getCelebration());
            assertNotNull(sl.getActivity());
            assertNotNull(sl.getTravelAndPlaces());
            assertNotNull(sl.getObjectAndSymbols());
            assertNotNull(sl.getCustom());
            assertNotNull(sl.getEmoji());
        });
    }
}