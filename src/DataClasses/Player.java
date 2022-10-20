package DataClasses;

public class Player {
    int PlayerID;
    String PlayerName;

    public Player(int playerID, String playerName) {
        PlayerID = playerID;
        PlayerName = playerName;
    }

    public int getPlayerID() {
        return PlayerID;
    }

    public void setPlayerID(int playerID) {
        PlayerID = playerID;
    }

    public String getPlayerName() {
        return PlayerName;
    }

    public void setPlayerName(String playerName) {
        PlayerName = playerName;
    }

}
