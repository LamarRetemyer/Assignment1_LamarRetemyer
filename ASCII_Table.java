import java.util.*; 

public class ASCII_Table {
    public static void main(String[] args){  

        System.out.print("Please enter the ASCII code: ");
        Scanner intScanner = new Scanner(System.in);
        int answer = intScanner.nextInt();
        intScanner.close();

       

        char asciiChar = (char) answer;

        
        
        System.out.println("Symbol: " + asciiChar);
        
        

        
        
        
    }

    
}