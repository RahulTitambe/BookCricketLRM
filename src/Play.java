import DataClasses.CurrentBall;
import DataClasses.FirstInningScore;
import DataClasses.Player;
import Lists.Commentary;
import Lists.PlayersList;

import java.util.Scanner;

public class Play {

    RandomRunGenerator randomRunGenerator = new RandomRunGenerator();
    Commentary commentary = new Commentary();
    CurrentBall currentBall;
    FirstInningScore firstInningScore;
    PlayersList playersList = new PlayersList();
    Player player;

    void play(){

        commentary.AddCommentaryToList();
        playersList.addPlayersToList();

        Scanner play = new Scanner(System.in);

        /*while (firstInningScore.getBallCount() <= 30){
            if(play.nextInt() == 1){
                currentBall = randomRunGenerator.currentBall();
                scoreUpdate(currentBall.getRun());
                print();
            }
        }*/

        for(int i=0; i<30; i++){
                currentBall = randomRunGenerator.currentBall();
                scoreUpdate(currentBall.getRun());
                print();
        }


    }

    private void scoreUpdate(int run){

        if(currentBall.isLegal()){
            switch(run){
                case 0:
                    firstInningScore.setWickets(firstInningScore.getWickets()+1);
                    firstInningScore.setBallCount(firstInningScore.getBallCount()+1);
                    break;

                case 1:
                    firstInningScore.setTotalRuns(firstInningScore.getTotalRuns()+1);
                    firstInningScore.setBallCount(firstInningScore.getBallCount()+1);
                    break;

                case 2:
                    firstInningScore.setTotalRuns(firstInningScore.getTotalRuns()+2);
                    firstInningScore.setBallCount(firstInningScore.getBallCount()+1);
                    break;

                case 3:
                    firstInningScore.setTotalRuns(firstInningScore.getTotalRuns()+3);
                    firstInningScore.setBallCount(firstInningScore.getBallCount()+1);
                    break;

                case 4:
                    firstInningScore.setTotalRuns(firstInningScore.getTotalRuns()+4);
                    firstInningScore.setBallCount(firstInningScore.getBallCount()+1);
                    break;

                case 5:
                    firstInningScore.setTotalRuns(firstInningScore.getTotalRuns()+5);
                    firstInningScore.setBallCount(firstInningScore.getBallCount()+1);
                    break;

                case 6:
                    firstInningScore.setTotalRuns(firstInningScore.getTotalRuns()+6);
                    firstInningScore.setBallCount(firstInningScore.getBallCount()+1);
                    break;

            }
        }
        else {
            firstInningScore.setTotalRuns(firstInningScore.getTotalRuns()+1);
        }

    }

    private void print(){
        System.out.println(String.valueOf("Current Ball Run:" + currentBall.getRun()) + " "
                + String.valueOf(currentBall.isLegal()) + "\n"
                + commentary.Commentary(currentBall.getRun()) + " "
                + "Score:" + firstInningScore.getTotalRuns() + " "
                + "Wickets:" + firstInningScore.getWickets() + " "
                + "Batsman:" + playersList.teamOnePlayersList.get(firstInningScore.getWickets()).getPlayerName());
    }

    public void initialize(){
        firstInningScore = new FirstInningScore(00,0,00,00,00,00);
    }

}
