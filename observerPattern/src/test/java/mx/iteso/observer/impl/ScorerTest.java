package mx.iteso.observer.impl;

import mx.iteso.observer.Scorer;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by giovanni on 28/09/2015.
 */
public class ScorerTest {
    Scorer scorer;

    @Before
    public void setUp(){
        scorer = new Scorer("Christian Gimenez", 10, "Miedfielder", "Cruz Azul");
    }

    @Test
    public void testSetName(){
        scorer.setName("Chaco Gimenez");
        assertEquals("Chaco Gimenez", scorer.getName());
    }

    @Test
    public void testScorer(){
        assertEquals("Name: Christian Gimenez, Number: 10, Position: Miedfielder, Team: Cruz Azul", scorer.toString());
    }
}
