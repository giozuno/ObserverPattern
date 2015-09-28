package mx.iteso.observer;

import mx.iteso.observer.impl.AppMobileDisplay;
import mx.iteso.observer.impl.ScoresData;
import mx.iteso.observer.impl.StoreMonitorDisplay;

import java.util.ArrayList;

public class NewsStation {
    public static void main( String[] args ){
        ScoresData scoresData = new ScoresData();

        StoreMonitorDisplay storeMonitorDisplay = new StoreMonitorDisplay(scoresData);
        AppMobileDisplay appMobileDisplay = new AppMobileDisplay(scoresData);

        ArrayList<Scorer> scorersCAvsUNAM = new ArrayList<Scorer>();
        scorersCAvsUNAM.add(new Scorer("Christian Gimenez", 10, "Midfielder", "Cruz Azul"));
        scorersCAvsUNAM.add(new Scorer("Javier Cortez", 7, "Midfielder", "Pumas"));
        ArrayList<Scorer> scorersTKvsIn = new ArrayList<Scorer>();
        scorersTKvsIn.add(new Scorer("Ray", 9, "Forward", "Tacit Knowledge"));
        scorersTKvsIn.add(new Scorer("Juan", 11, "Forward", "Intel"));

        scoresData.setScore("Cruz Azul", "Pumas", 2, 1, scorersCAvsUNAM);
        scoresData.setScore("Tacit Knowledge", "Intel", 8, 1, scorersTKvsIn);
        //scoresData.setScore("Chivas", "Queretaro", 2, 1);
        //scoresData.setScore("La Ganga", "Muebles America", 0, 0);
    }
}
