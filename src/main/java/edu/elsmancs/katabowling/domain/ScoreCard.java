package edu.elsmancs.katabowling.domain;

public class ScoreCard {

    private int finalScore = 0;
    private String scoreCard = "";


    public ScoreCard(String scoreCard) {
        this.scoreCard = scoreCard;
    }

    public int gameScore() {
        int puntos = 0;
        for (int rolls=0; rolls < this.scoreCard.length(); rolls++) {
            puntos += this.scoreCard.charAt(rolls);
        }
        return puntos;
    }
}
