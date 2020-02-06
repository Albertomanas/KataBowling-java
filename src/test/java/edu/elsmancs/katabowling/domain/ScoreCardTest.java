package edu.elsmancs.katabowling.domain;

import org.junit.Test;
import static org.junit.Assert.*;
import edu.elsmancs.katabowling.domain.ScoreCard;

public class ScoreCardTest {

    @Test
    public void SumarScoreCard(){
        ScoreCard scoreCard = new ScoreCard("12345123451234512345");
        assertEquals(60 , scoreCard.gameScore());
    }
}
