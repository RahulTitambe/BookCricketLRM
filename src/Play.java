import DataClasses.CurrentBall;
import DataClasses.TeamOneScore;
import Lists.Commentary;
import Lists.PlayersList;

import java.util.Scanner;

public class Play {

    RandomRunGenerator randomRunGenerator = new RandomRunGenerator();
    Commentary commentary = new Commentary();
    PlayersList playersList = new PlayersList();
    CalculateOvers calculateOvers = new CalculateOvers();

    //Data Class Objects
    CurrentBall currentBall;
    TeamOneScore teamOneScore;


    void play(){

        commentary.AddCommentaryToList();
        playersList.addPlayersToList();
        starterPrint();

        Scanner play = new Scanner(System.in);

        while (teamOneScore.getBallCount() < 30){
            if(play.nextInt() == 1){
                currentBall = randomRunGenerator.currentBall();
                scoreUpdate(currentBall.getRun());
                print();
            }
        }

        /*for(int i=0; i<30; i++){
                currentBall = randomRunGenerator.currentBall();
                scoreUpdate(currentBall.getRun());
                print();
        }*/


    }

    private void scoreUpdate(int run){

        if(currentBall.isLegal()){
            switch(run){
                case 0:
                    teamOneScore.setWickets(teamOneScore.getWickets()+1);
                    teamOneScore.setBallCount(teamOneScore.getBallCount()+1);
                    playersList.teamOnePlayersList.get(teamOneScore.getWickets()).getIndividualRunsScored();
                    break;

                case 1:
                    teamOneScore.setTotalRuns(teamOneScore.getTotalRuns()+1);
                    teamOneScore.setBallCount(teamOneScore.getBallCount()+1);
                    playersList.teamOnePlayersList.get(teamOneScore.getWickets()).setIndividualRunsScored(
                            playersList.teamOnePlayersList.get(teamOneScore.getWickets())
                                    .getIndividualRunsScored() +1);
                    break;

                case 2:
                    teamOneScore.setTotalRuns(teamOneScore.getTotalRuns()+2);
                    teamOneScore.setBallCount(teamOneScore.getBallCount()+1);
                    playersList.teamOnePlayersList.get(teamOneScore.getWickets()).setIndividualRunsScored(
                            playersList.teamOnePlayersList.get(teamOneScore.getWickets())
                                    .getIndividualRunsScored() +2);
                    break;

                case 3:
                    teamOneScore.setTotalRuns(teamOneScore.getTotalRuns()+3);
                    teamOneScore.setBallCount(teamOneScore.getBallCount()+1);
                    playersList.teamOnePlayersList.get(teamOneScore.getWickets()).setIndividualRunsScored(
                            playersList.teamOnePlayersList.get(teamOneScore.getWickets())
                                    .getIndividualRunsScored() +3);
                    break;

                case 4:
                    teamOneScore.setTotalRuns(teamOneScore.getTotalRuns()+4);
                    teamOneScore.setBallCount(teamOneScore.getBallCount()+1);
                    playersList.teamOnePlayersList.get(teamOneScore.getWickets()).setIndividualRunsScored(
                            playersList.teamOnePlayersList.get(teamOneScore.getWickets())
                                    .getIndividualRunsScored() +4);
                    break;

                case 5:
                    teamOneScore.setTotalRuns(teamOneScore.getTotalRuns()+5);
                    teamOneScore.setBallCount(teamOneScore.getBallCount()+1);
                    playersList.teamOnePlayersList.get(teamOneScore.getWickets()).setIndividualRunsScored(
                            playersList.teamOnePlayersList.get(teamOneScore.getWickets())
                                    .getIndividualRunsScored() +5);
                    break;

                case 6:
                    teamOneScore.setTotalRuns(teamOneScore.getTotalRuns()+6);
                    teamOneScore.setBallCount(teamOneScore.getBallCount()+1);
                    playersList.teamOnePlayersList.get(teamOneScore.getWickets()).setIndividualRunsScored(
                            playersList.teamOnePlayersList.get(teamOneScore.getWickets())
                                    .getIndividualRunsScored() +6);
                    break;

            }
        }
        else {
            teamOneScore.setTotalRuns(teamOneScore.getTotalRuns()+1);
        }

    }

    private void print(){

        System.out.println("Current Ball Run: " + currentBall.getRun() + " "
                + commentary.Commentary(currentBall.getRun()) + " "
                + "Score:" + teamOneScore.getTotalRuns() + " "
                + "Wickets:" + teamOneScore.getWickets() + " "
                + "Batsman:" + playersList.teamOnePlayersList.get(teamOneScore.getWickets()).getPlayerName() + ""
                + "["
                + playersList.teamOnePlayersList.get(teamOneScore.getWickets()).getIndividualRunsScored()
                +"]"
                + " Overs: " + calculateOvers.calculateOvers(teamOneScore.getBallCount()));
    }

    private void starterPrint(){

        System.out.println("Score:" + teamOneScore.getTotalRuns() + " "
                + "Wickets:" + teamOneScore.getWickets() + " "
                + "Batsman:" + playersList.teamOnePlayersList.get(teamOneScore.getWickets()).getPlayerName() + ""
                + "["
                + playersList.teamOnePlayersList.get(teamOneScore.getWickets()).getIndividualRunsScored()
                +"]"
                + " Overs: " + calculateOvers.calculateOvers(teamOneScore.getBallCount()));
    }

    public void initialize(){
        teamOneScore = new TeamOneScore(00,0,00,00,00,0);
    }



}
