package Lists;

import DataClasses.Player;

import java.util.ArrayList;

public class PlayersList {

    public ArrayList<Player> teamOnePlayersList = new ArrayList<>();
    public ArrayList<Player> teamTwoPlayersList = new ArrayList<>();

    private void addTeamOnePlayers(){
        teamOnePlayersList.add(new Player(1, "K Shashank", 00));
        teamOnePlayersList.add(new Player(2, "T Rahul", 00));
        teamOnePlayersList.add(new Player(3, "R Balasaheb", 00));
        teamOnePlayersList.add(new Player(4, "P Yogesh", 00));
        teamOnePlayersList.add(new Player(5, "K Akshay", 00));
        teamOnePlayersList.add(new Player(6, "L Deepak", 00));
        teamOnePlayersList.add(new Player(7, "S Rushikesh", 00));
        teamOnePlayersList.add(new Player(8,"M Kaustubh", 00));
        teamOnePlayersList.add(new Player(9, "P Pooja", 00));
        teamOnePlayersList.add(new Player(10, "K Shreya", 00));
    }

    private void addTeamTwoPlayers(){
        teamTwoPlayersList.add(new Player(11, "Tim Paine", 00));
        teamTwoPlayersList.add(new Player(12, "Adam Gilchrist", 00));
        teamTwoPlayersList.add(new Player(13, "Ricky Ponting", 00));
        teamTwoPlayersList.add(new Player(14, "Michael Hussey", 00));
        teamTwoPlayersList.add(new Player(15, "Shane Watson", 00));
        teamTwoPlayersList.add(new Player(16, "George Bailey", 00));
        teamTwoPlayersList.add(new Player(17, "Steve Smith", 00));
        teamTwoPlayersList.add(new Player(18, "Aaron Finch", 00));
        teamTwoPlayersList.add(new Player(19, "David Warner", 00));
        teamTwoPlayersList.add(new Player(20, "Alex Carey", 00));
    }

    public void addPlayersToList(){
        addTeamOnePlayers();
        addTeamTwoPlayers();
    }
}
