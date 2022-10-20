package DataClasses;

public class FirstInningScore {
    int TotalRuns =0;
    int Wickets =0;
    int Batsman;
    int Bowler;
    double RunRate = 0.0;
    int BallCount = 0;
    float Overs = 0;

    public FirstInningScore(int totalRuns, int wickets, int batsman, int bowler, double runRate, int ballCount) {
        TotalRuns = totalRuns;
        Wickets = wickets;
        Batsman = batsman;
        Bowler = bowler;
        RunRate = runRate;
        BallCount = ballCount;
    }

    public int getTotalRuns() {
        return TotalRuns;
    }

    public void setTotalRuns(int totalRuns) {
        TotalRuns = totalRuns;
    }

    public int getWickets() {
        return Wickets;
    }

    public void setWickets(int wickets) {
        Wickets = wickets;
    }

    public int getBatsman() {
        return Batsman;
    }

    public void setBatsman(int batsman) {
        Batsman = batsman;
    }

    public int getBowler() {
        return Bowler;
    }

    public void setBowler(int bowler) {
        Bowler = bowler;
    }

    public double getRunRate() {
        return RunRate;
    }

    public void setRunRate(double runRate) {
        RunRate = runRate;
    }

    public int getBallCount() {
        return BallCount;
    }

    public void setBallCount(int ballCount) {
        BallCount = ballCount;
    }

    public float getOvers() {
        return Overs;
    }

    public void setOvers(float overs) {
        Overs = overs;
    }
}
