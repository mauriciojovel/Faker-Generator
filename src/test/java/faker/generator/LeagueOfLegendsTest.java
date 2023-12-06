package faker.generator;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import faker.generator.models.LeagueOfLegends;
import java.util.Optional;
import org.junit.jupiter.api.Test;
class LeagueOfLegendsTest {
    @Test
    void testLeagueOfLegends() {
        Optional<LeagueOfLegends> c = FakerGen.create(LeagueOfLegends.class);
        assertTrue(c.isPresent());
        c.ifPresent(co -> {
            assertNotNull(co.getChampion());
            assertNotNull(co.getLocation());
            assertNotNull(co.getMasteries());
            assertNotNull(co.getQuote());
            assertNotNull(co.getRank());
            assertNotNull(co.getSummonerSpell());
        });
    }
}
