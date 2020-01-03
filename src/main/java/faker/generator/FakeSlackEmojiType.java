package faker.generator;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FakeSlackEmojiType {
    PEOPLE, NATURE, FOOD_AND_DRINK, CELEBRATION, ACTIVITY, TRAVEL_AND_PLACES, OBJECT_AND_SYMBOLS, CUSTOM, EMOJI;
}
