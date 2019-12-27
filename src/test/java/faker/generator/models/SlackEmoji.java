package faker.generator.models;

import faker.generator.FakeSlackEmoji;
import faker.generator.FakeSlackEmojiType;
import lombok.Data;

@Data
public class SlackEmoji {
    @FakeSlackEmoji(FakeSlackEmojiType.PEOPLE)
    private String people;

    @FakeSlackEmoji(FakeSlackEmojiType.NATURE)
    private String nature;

    @FakeSlackEmoji(FakeSlackEmojiType.FOOD_AND_DRINK)
    private String foodAndDrink;

    @FakeSlackEmoji(FakeSlackEmojiType.CELEBRATION)
    private String celebration;

    @FakeSlackEmoji(FakeSlackEmojiType.ACTIVITY)
    private String activity;

    @FakeSlackEmoji(FakeSlackEmojiType.TRAVEL_AND_PLACES)
    private String travelAndPlaces;

    @FakeSlackEmoji(FakeSlackEmojiType.OBJECT_AND_SYMBOLS)
    private String objectAndSymbols;

    @FakeSlackEmoji(FakeSlackEmojiType.CUSTOM)
    private String custom;

    @FakeSlackEmoji(FakeSlackEmojiType.EMOJI)
    private String emoji;
}