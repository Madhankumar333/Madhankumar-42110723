package objectoriented;
import java.util.Scanner;
public class mainstu {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("ENTER YOUR NAME: ");
        String name = s.nextLine();  

        System.out.print("ENTER YOUR ID: ");
        int id = s.nextInt();

        System.out.print("ENTER YOUR DEPARTMENT: ");
        String dep = s.next();
        
        s.nextLine();

        System.out.print("ENTER THE THESIS: ");
        String thesis = s.nextLine();

        
        PassedOutStudents m = new PassedOutStudents(name, id, dep, thesis);

        
        m.display1();  

        
        /*StudentDetails n = new StudentDetails();
        n.display1();  */
    }
}
