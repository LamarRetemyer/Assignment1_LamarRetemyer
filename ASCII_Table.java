import java.util.*; 

public class ASCII_Table {
    public static void main(String[] args){  

        //Code to accept the unicode and display the charcter....

        System.out.print("Please enter the ASCII code: ");
        //Create scanner object

        Scanner scanner = new Scanner(System.in);

        //Receive user input as integer
        int answer = scanner.nextInt();

        //Convert user input to char
        char asciiChar = (char) answer;

        //Display the result
        System.out.println("Symbol: " + asciiChar);

        //Additional scripts to accept the unicode of the charcter....


       System.out.print("\nPlease enter a character to display their unicode: ");

       //Receive input as string then convert the first index to a character to be stored
       char symbol = scanner.next().charAt(0); 

       //Convert the symbol to integer to display the number
       int unicode = symbol;

        //Close the scanner
       scanner.close();

       //Display the results
       System.out.println("Unicode: " + unicode);
       

    


        

        
        
     
        
        

        
        
        
    }

    
}