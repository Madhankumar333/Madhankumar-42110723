import java.util.Scanner;
import java.util.Scanner;

public class trychtch2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        

        System.out.print("Enter monthly income: ");
        double income = s.nextDouble();
        
        double expenses = 0;
        
        while (true) {
            try {
                System.out.print("Enter monthly expenses: ");
                expenses = s.nextDouble();
                break; 
            } catch (Exception e) {
                System.out.println("Error: Please enter a valid numeric value.");
                s.next(); 
            }
        }
        
        
        double Balance = income - expenses;

        System.out.println("Remaining balance: Rs " + Balance);
        
    }
}
