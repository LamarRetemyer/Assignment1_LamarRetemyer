// ************************************************************
// Guess.java
//
// Play a game where the user guesses a number from 1 to 10
//
// ************************************************************
import java.util.Scanner;
import java.util.Random;

public class Guess{
    public static void main(String[] args){
        int numToGuess; //Number the user tries to guess int guess; //The user’s guess
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        //randomly generate the number to guess
        int randNum = generator.nextInt(10) + 1;

        //print message asking user to enter a guess
        System.out.print("Please enter a number: ");
        numToGuess = scan.nextInt();

        //read in guess
        while(numToGuess != randNum){//keep going as long as the guess is wrong
        //print message saying guess is wrong
        System.out.print("Sorry your guess is wrong. Try Again!: ");
        
        //If statement to give the user a hint to the polarity of their guess
        if (numToGuess > randNum){
            System.out.println("Your guess was too high.");
        }
        else{
            System.out.println("Your guess was too low.");
        }

        //get another guess from the user
        numToGuess = scan.nextInt();
        }
        scan.close();
    //print message saying guess is right
    System.out.println("Congratulations!! Your guess was correct !!");
    }
}
