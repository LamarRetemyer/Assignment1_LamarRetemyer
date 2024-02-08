import java.util.Scanner;
// ****************************************************************
// LoveCS.java
//
// Use a while loop to print many messages declaring your
// passion for computer science
// ****************************************************************
public class LoveCS {
    public static void main(String[] args) {
        //Add a while loop that checks to see if the user input is positive else it should not 
    
        //Create a scanner to receive user input
        
        System.out.print("Please enter the number of times you wish to print it: ");
        Scanner scanner = new Scanner(System.in);
        //Store the limit of how many iterations the user wants
        int limit = scanner.nextInt();
        scanner.close();
        //Start the count 
        int count = 1;
        //Store the sum of each iteration
        int sum = 0;
        while (count <= limit){
        System.out.println(count + ". I love Computer Science!!");
        sum = sum + count; //Formula to calculate the sum of each iteration
        count++; //Iterate
        }
        System.out.println("Printed this message " + (count -1) + " times. The sum of the numbers from 1 to " + (count - 1) + " is " + sum + ".");
    }
}
