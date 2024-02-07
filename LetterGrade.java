import java.util.Scanner;
public class LetterGrade {
    public static void main(String[] args) {
        //Code to display the appropriate numeric value for letter grade....

        System.out.print("Please enter a letter Grade A-F: ");

        Scanner scanner = new Scanner(System.in);

        //Receive scanner as string
        char grade = scanner.next().charAt(0);

        scanner.close();

        //Use if statements to display the appropriate grade
        if (grade == 'A'){
            System.out.println("Your grade is 4.");
        }
        else if(grade == 'B'){
            System.out.println("Your grade is 3.");
        }
        else if(grade == 'C'){
            System.out.println("Your grade is 2.");
        }
        else if(grade == 'D'){
            System.out.println("Your grade is 1.");
        }
        else {
            System.out.println("Your grade is 0.");
        }
    }
    
}
