package faker.generator.services;

import faker.generator.FakeSlackEmoji;
import java.lang.reflect.Field;
import net.datafaker.Faker;

public class FakeSlackEmojiService implements FakeService<FakeSlackEmoji> {
    @Override
    public void setValue(FakeSlackEmoji annotation, Field target, Object data, Faker faker) throws IllegalAccessException {
        switch (annotation.value()) {
            case PEOPLE:
                target.set(data, faker.slackEmoji().people());
                break;
            case NATURE:
                target.set(data, faker.slackEmoji().nature());
                break;
            case FOOD_AND_DRINK:
                target.set(data, faker.slackEmoji().foodAndDrink());
                break;
            case CELEBRATION:
                target.set(data, faker.slackEmoji().celebration());
                break;
            case ACTIVITY:
                target.set(data, faker.slackEmoji().activity());
                break;
            case TRAVEL_AND_PLACES:
                target.set(data, faker.slackEmoji().travelAndPlaces());
                break;
            case OBJECT_AND_SYMBOLS:
                target.set(data, faker.slackEmoji().objectsAndSymbols());
                break;
            case CUSTOM:
                target.set(data, faker.slackEmoji().custom());
                break;
            case EMOJI:
                target.set(data, faker.slackEmoji().emoji());
                break;
        }
    }
}