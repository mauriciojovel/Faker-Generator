package faker.generator.test;

import faker.generator.FakerGen;
import faker.generator.models.LeagueOfLegends;
import org.junit.Test;
import java.util.Optional;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class LeagueOfLegendsTest {

    @Test
    public void testLeagueOfLegends() {
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
