import java.util.*;

public class Triangle {
    public static void main(String[] args) {
        //Code to find the missing angle in a right triangle...

        System.out.print("Please enter two angles separated by a space: ");
        
        Scanner scanner = new Scanner(System.in);

        //Accept the 2 inputs from the scanner 
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        scanner.close();

        //Calculate the angle 
        double angle = Math.sqrt((Math.pow(num1, 2) + Math.pow(num2, 2))); 

        //Display the answer
        System.out.println("Angle in degrees: " + angle);
        System.out.println("The three angles are: " + num1 + ", " + num2 + ", " + angle);
    }
    
}
