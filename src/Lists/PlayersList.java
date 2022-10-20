package Lists;

import DataClasses.Player;

import java.util.ArrayList;

public class PlayersList {

    public ArrayList<Player> teamOnePlayersList = new ArrayList<>();
    public ArrayList<Player> teamTwoPlayersList = new ArrayList<>();

    private void addTeamOnePlayers(){
        teamOnePlayersList.add(new Player(1, "K Shashank"));
        teamOnePlayersList.add(new Player(2, "T Rahul"));
        teamOnePlayersList.add(new Player(3, "R Balasaheb"));
        teamOnePlayersList.add(new Player(4, "P Yogesh"));
        teamOnePlayersList.add(new Player(5, "K Akshay"));
        teamOnePlayersList.add(new Player(6, "L Deepak"));
        teamOnePlayersList.add(new Player(7, "S Rushikesh"));
        teamOnePlayersList.add(new Player(8,"M Kaustubh"));
        teamOnePlayersList.add(new Player(9, "P Pooja"));
        teamOnePlayersList.add(new Player(10, "K Shreya"));
    }

    private void addTeamTwoPlayers(){
        teamTwoPlayersList.add(new Player(11, "Tim Paine"));
        teamTwoPlayersList.add(new Player(12, "Adam Gilchrist"));
        teamTwoPlayersList.add(new Player(13, "Ricky Ponting"));
        teamTwoPlayersList.add(new Player(14, "Michael Hussey"));
        teamTwoPlayersList.add(new Player(15, "Shane Watson"));
        teamTwoPlayersList.add(new Player(16, "George Bailey"));
        teamTwoPlayersList.add(new Player(17, "Steve Smith"));
        teamTwoPlayersList.add(new Player(18, "Aaron Finch"));
        teamTwoPlayersList.add(new Player(19, "David Warner"));
        teamTwoPlayersList.add(new Player(20, "Alex Carey"));
    }

    public void addPlayersToList(){
        addTeamOnePlayers();
        addTeamTwoPlayers();
    }
}
