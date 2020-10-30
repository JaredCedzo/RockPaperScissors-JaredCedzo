import java.util.Arrays;

public class Opponent {

    public String[] ranks = {"Rock", "Paper", "Scissors"};
    public String oChoice;

    public String choice() {
        for (int i = 0; i < ranks.length; i++) {
            int rand = (int) (Math.random() * ranks.length);
            String temp = ranks[rand];
            ranks[rand] = ranks[i];
            ranks[i] = temp;
        }
        oChoice = ranks[0];
        return oChoice;
    }

    public String getChoice(){
        return oChoice;
    }



}
