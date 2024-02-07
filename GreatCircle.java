import java.util.Scanner;
import java.lang.Math;

public class GreatCircle {
    public static void main(String[] args) {
        //Accept the latitude and longitude values
        System.out.print("Please enter the latitude points: ");
        Scanner scanner = new Scanner(System.in);

        double x1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();

        System.out.print("Please enter the longitude points: ");

        double y1 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        scanner.close();
        
        //Convert degrees to radians
        //Calculate the distance between the two points using formula
        double d = 6371.01 * Math.acos(Math.sin(x1 * Math.sin(Math.toRadians(x2)) + Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1) - Math.toRadians(y2))));
        
        //Display the results 
        System.out.println("The distance between the two points is: " + d);

    }

    
}
