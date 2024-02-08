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
        int counter = 1;//Counter starting at 1 given the user would have already tried to get the answer before 
        int highCounter = 0;
        int lowCounter = 0;
        //read in guess
        while(numToGuess != randNum){//keep going as long as the guess is wrong
            counter++;//Counter

            //print message saying guess is wrong            
            System.out.print("Sorry your guess is wrong. Try Again!.");
            
            //If statement to give the user a hint to the polarity of their guess
            if (numToGuess > randNum){
                System.out.print("Your guess was too high: ");
                highCounter++; //counter for keeping track of the number of high guesses
            }
            else{
                System.out.print("Your guess was too low: "); //counter for keeping track of the number of low guesses
                lowCounter ++;
            }

            //get another guess from the user
            numToGuess = scan.nextInt();
        }
        scan.close();
    //print message saying guess is right and additional information
    System.out.println("Congratulations!! Your guess was correct !!");
    System.out.println("You took " + counter + " tries.");
    System.out.println( "\nPerformance summary: \nHigh guesses: " + highCounter + "\nLow guesses: " + lowCounter );
    }
}
