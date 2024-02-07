import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        //create a scanner object and display message for the user 
        System.out.print("Enter integer: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        //create variables to store the product and the count
        int product = 1;
        int i = 1;
        //if the user enters 0 print 1
        if (number == 0){
            System.out.println("0! = 1");
        }
        else{
        //if user input != 0
            while(i <= number){
                //while i <= input multiply product by i
                product = product * i;
                i++;
            }      
            System.out.println(number + "!= " + product); //Display the result
        }
        
    }
}
