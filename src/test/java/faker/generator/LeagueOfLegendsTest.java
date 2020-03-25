package faker.generator;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import faker.generator.FakerGen;
import faker.generator.models.*;

import java.util.Locale;
import java.util.Optional;
import org.junit.Test;
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
