import DataClasses.CurrentBall;

import java.util.Random;

public class RandomRunGenerator {

    int run;
    boolean IsLegal;

    Random random = new Random();
    CurrentBall currentBall;


    public void randomNumberGenerator(){
        run = random.nextInt(8);
    }

    public CurrentBall currentBall(){

        randomNumberGenerator();

        if(run == 7){
            IsLegal = false;
        }
        else {
            IsLegal = true;
        }

        currentBall = new CurrentBall(run, IsLegal);

        return currentBall;
    }

}
