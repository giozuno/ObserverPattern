package mx.iteso.observer.impl;

import mx.iteso.observer.Displayable;
import mx.iteso.observer.Observer;
import mx.iteso.observer.Scorer;
import mx.iteso.observer.Subject;

import java.util.ArrayList;
import java.util.List;

public class StoreMonitorDisplay implements Observer, Displayable {
    private String homeTeam;
    private String awayTeam;
    private int homeGoals;
    private int awayGoals;
    private Subject scoresData;
    private List<Scorer> scorers;

    public StoreMonitorDisplay(Subject scoresData){
        this.scoresData = scoresData;
        this.scoresData.registerObserver(this);
    }

    /*
    public void displayScore() {
        System.out.println("STORE MONITOR" + "\nLatest score is:");
        System.out.println("Scorers:");
        for (Scorer scorer : scorers) {
            System.out.println(scorer);
        }
        System.out.println("Match Result: " + homeTeam + " (HOME) " + homeGoals + " - "
                + awayTeam + " (AWAY) " + awayGoals);
    }
    */

    public String displayScore() {
        System.out.println("STORE MONITOR" + "\nLatest score is:");
        System.out.println("Scorers:");
        for (Scorer scorer : scorers) {
            System.out.println(scorer);
        }
        return "Match Result: " + homeTeam + " (HOME) " + homeGoals + " - "
                + awayTeam + " (AWAY) " + awayGoals;
    }



    public void update(String home, String away, int homeGoals, int awayGoals, ArrayList<Scorer> scorers) {
        this.homeTeam = home;
        this.awayTeam = away;
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;
        this.scorers = scorers;

        System.out.println(displayScore());
    }

}
