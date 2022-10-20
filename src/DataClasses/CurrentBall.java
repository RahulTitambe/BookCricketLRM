package DataClasses;

public class CurrentBall {
    int run;
    boolean IsLegal;

    public CurrentBall(int run, boolean isLegal) {
        this.run = run;
        IsLegal = isLegal;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public boolean isLegal() {
        return IsLegal;
    }

    public void setLegal(boolean legal) {
        IsLegal = legal;
    }
}
