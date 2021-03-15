import java.util.Scanner;

public class GuessingGame {
        //Three instance Variables for three Player Object;
    Player kamil;
    Player cami;
    Player devinah;

    public void startGame(){
            //Creating new Player Objects
        kamil = new Player();
        cami = new Player();
        devinah = new Player();

            //variables that hold the player's Guess;
        int kamilGuess = 0;
        int camiGuess = 0;
        int devinahGuess = 0;

            //holds true/false based on the player's answer;
        boolean kamilIsRight = false;
        boolean camiIsRight = false;
        boolean devinahIsRight = false;


            while(true){

                    //Generating the random number to guess;
                int randomNum = (int)(Math.random()* 10);

                    //Calling the players to guess;
                kamil.guess();
                cami.guess();
                devinah.guess();

                    //Storing each player's guess result;
                kamilGuess = kamil.number;
                System.out.println("Kamil guessed "+kamilGuess);
                camiGuess = cami.number;
                System.out.println("Cami guessed "+camiGuess);
                devinahGuess = devinah.number;
                System.out.println("Devinah guessed "+devinahGuess);

                    //Checking the player's guess against the target number;
                if (randomNum == kamilGuess){
                    kamilIsRight = true;
                }
                if (randomNum == camiGuess){
                    camiIsRight = true;
                }
                if (randomNum == devinahGuess){
                    devinahIsRight = true;
                }

                    //If Any of em is Right, we've a Winner;
                if(kamilIsRight || camiIsRight || devinahIsRight){
                    System.out.println("We've a Winner!!!");
                    System.out.println("Camila is Right?"+camiIsRight);
                    System.out.println("Kamil is Right?"+kamilIsRight);
                    System.out.println("Devinah is Right?"+devinahIsRight);
                    break;

                }
                System.out.println("Number to Guess was "+randomNum);

                System.out.println("No one Guessed it Right. Try Again!");

            }
    }

}
class Player {
    int number = 0;

    public void guess(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to guess: ");
       number = sc.nextInt();

    }
}

class GameLauncher{
    public static void main(String[] args) {
        GuessingGame guessGame = new GuessingGame();
        guessGame.startGame();
    }
}