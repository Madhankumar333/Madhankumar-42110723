package recurtion;
import java.util.Scanner;

public class function {
    public static void main(String[] args) { // Added the main method
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = s.nextInt();
        int x = power(n, a);
        int y = fact(n);
        System.out.println("The factorial of " +n+ " is:"+ y);
        System.out.println("The value of " + n + " power " + a + " is " + x);
        // The factorial result `y` is computed but not displayed. 
        // You can print it if needed.
        /*power(5,4)->5*po(5,3)->5*po(5,2)->5*po(5,1)->5*po(5,0)*/
        /*returns(625)<-(125*5)<-(25*5)<- 	(5*5)<-  5*it return(1)*/
    }

    public static int power(int n, int a) {
        if (a <= 0) {
            return 1;
        }
        return n * power(n, a - 1);
    }

    public static int fact(int n) {
        if (n <= 0) {
            return 1;
        }
        return n * fact(n - 1);
    }
}



