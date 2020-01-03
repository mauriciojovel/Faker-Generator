package faker.generator.models;

import faker.generator.FakeShakespeare;
import faker.generator.FakeShakespeareType;
import lombok.Data;

@Data
public class Shakespeare {
    @FakeShakespeare(FakeShakespeareType.HAMLET_QUOTE)
    private String hamletQuote;

    @FakeShakespeare(FakeShakespeareType.AS_YOU_LIKE_IT_QUOTE)
    private String asYouLikeItQuote;

    @FakeShakespeare(FakeShakespeareType.KING_RICHARD_QUOTE)
    private String kingRichardQuote;

    @FakeShakespeare(FakeShakespeareType.ROMEO_JULIET_QUOTE)
    private String romeoJulietQuote;
}