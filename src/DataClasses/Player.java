package DataClasses;

public class Player {
    int PlayerID;
    String PlayerName;
    int IndividualRunsScored;

    public Player(int playerID, String playerName, int IndividualRunsScored) {
        PlayerID = playerID;
        PlayerName = playerName;
        IndividualRunsScored = IndividualRunsScored;
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

    public int getIndividualRunsScored() {
        return IndividualRunsScored;
    }

    public void setIndividualRunsScored(int individualRunsScored) {
        IndividualRunsScored = individualRunsScored;
    }

}
