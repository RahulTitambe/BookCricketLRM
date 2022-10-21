package Lists;

import java.util.ArrayList;
import java.util.Random;

public class Commentary {

    public ArrayList<String> FourCommentary = new ArrayList<>();
    public ArrayList<String> SixCommentary = new ArrayList<>();
    public ArrayList<String> OutCommentary = new ArrayList<>();
    public ArrayList<String> IllegalCommentary = new ArrayList<>();

    Random random = new Random();

    public void AddCommentaryToList(){
        OutCommentary.add("Straight Down the Fielder's Throat");
        OutCommentary.add("Right Up into the Stumps");
        OutCommentary.add("Ohhh, bad luck");
        OutCommentary.add("Great Catch");
        OutCommentary.add("Finest bowling you can see");

        SixCommentary.add("That's a Proper Cricket Shot");
        SixCommentary.add("When He Hits, It is Six");
        SixCommentary.add("Into the Stadium");
        SixCommentary.add("Flat Hit");
        SixCommentary.add("Wooh, It was long");

        FourCommentary.add("Its a Four");
        FourCommentary.add("Magnificent Four");
        FourCommentary.add("Clean and Clever Shot");
        FourCommentary.add("One bounce Four");
        FourCommentary.add("Nice Shot");

        IllegalCommentary.add("Opps, That was Wide");
        IllegalCommentary.add("Illegal Delivery");
        IllegalCommentary.add("Opps, That was No Ball");
        IllegalCommentary.add("Damn...Free Run!");
        IllegalCommentary.add("Wide Ball...!");


    }

    public String Commentary(int run){


        int x = random.nextInt(5);

        switch (run){
            case 0:
                return OutCommentary.get(x);

            case 4:
                return FourCommentary.get(x);

            case 6:
                return SixCommentary.get(x);

            case 7:
                return IllegalCommentary.get(x);

        }
        return null;
    }
}
