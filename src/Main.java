import DataClasses.CurrentBall;
import Lists.Commentary;
import Lists.PlayersList;

import java.util.Currency;

public class Main {

    public static void main(String[] args) {

        Commentary commentary = new Commentary();
        PlayersList playersList = new PlayersList();
        Play play = new Play();

        play.initialize();
        play.play();
    }

}
