
public class CalculateOvers {

    double numberOfOvers;
    String round;
    String mod;

    public double calculateOvers(int ball) {

        round = String.valueOf(Math.round(ball / 6));
        mod=String.valueOf(ball%6);
        numberOfOvers=Double.valueOf(round+"."+mod);

        return numberOfOvers;

    }
}
