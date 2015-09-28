package mx.iteso.observer.impl;

import mx.iteso.observer.Scorer;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;

public class AppMobileDisplayTest {
    private AppMobileDisplay appMobileDisplay;
    private ScoresData scoresData;

    @Before
    public void setUp() {
        scoresData = mock(ScoresData.class);
        appMobileDisplay = new AppMobileDisplay(scoresData);
    }

    @Test
    public void testUpdate() {
        ArrayList<Scorer> scorers = new ArrayList<Scorer>();
        appMobileDisplay.update("homeTeam", "awayTeam", 1, 0, scorers);
        assertEquals("Match Result: homeTeam (HOME) 1 - awayTeam (AWAY) 0", appMobileDisplay.displayScore());
    }
}
