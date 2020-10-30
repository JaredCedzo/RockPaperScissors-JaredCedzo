import java.util.Scanner;

public class Player {

    private Scanner scn = new Scanner(System.in);
    Opponent ai = new Opponent();
    String aiChoice = new String();
    int numRounds;
    int oCounter = 0;
    int pCounter = 0;

    public void playGame(){
        System.out.println("What is your name?");
        String name = scn.next();
        System.out.println("Ok " + name + " how many rounds would you like to play?");
        numRounds = scn.nextInt();

        for(int i = 0; i < numRounds; i++) {
            System.out.println("Select your move and please capitalize");
            String pChoice = scn.next();
            ai.choice();
            aiChoice = ai.getChoice();
            System.out.println("Opponent Chooses: " + aiChoice);
            if (aiChoice.equals("Rock") && pChoice.equals("Rock")) {
                System.out.println("It's a tie!");
            } else if (aiChoice.equals("Rock") && pChoice.equals("Paper")) {
                System.out.println("You Win!");
                System.out.println("Opponent says: You got lucky this time punk");
                pCounter++;
            } else if (aiChoice.equals("Rock") && pChoice.equals("Scissors")) {
                System.out.println("You Lose!");
                System.out.println("Opponent says: Guess today is not your lucky day");
                oCounter++;
            } else if (aiChoice.equals("Paper") && pChoice.equals("Rock")) {
                System.out.println("You Lose");
                System.out.println("Opponent says: Better luck next time chump");
                oCounter++;
            } else if (aiChoice.equals("Paper") && pChoice.equals("Paper")) {
                System.out.println("It's a tie!");
            } else if (aiChoice.equals("Paper") && pChoice.equals("Scissors")) {
                System.out.println("You Win!");
                System.out.println("Opponent says: I let you have that one");
                pCounter++;
            } else if (aiChoice.equals("Scissors") && pChoice.equals("Rock")) {
                System.out.println("You Win!");
                System.out.println("Opponent says: Whatever, it's not like you are going to win anyways");
                pCounter++;
            } else if (aiChoice.equals("Scissors") && pChoice.equals("Paper")) {
                System.out.println("You Lose!");
                System.out.println("Opponent says: OOF!");
                oCounter++;
            } else if (aiChoice.equals("Scissors") && pChoice.equals("Scissors")) {
                System.out.println("It's a tie!");
            }
            System.out.println("Current Score: ");
            System.out.println(name + ": " + pCounter);
            System.out.println("Opponent: " + oCounter);
        }
        System.out.println("Game Over!");
        if(pCounter>oCounter){
            System.out.println(name + " wins!");
            System.out.println("Opponent says: Impossible! You cheated");
        }
        else if(pCounter<oCounter){
            System.out.println(name + " loses!");
            System.out.println("Opponent wins!");
            System.out.println("Opponent says: Can't say I'm surprised");
        }
        else{
            System.out.println("It's a tie!");
        }
    }
}
