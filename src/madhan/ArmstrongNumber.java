package madhan;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;
/*public class byme1 extends byme{
	private String byme;
	private String byme1;
	public	void student() {
			Scanner a=new Scanner(System.in);
			System.out.println("entr your id");
			int m=a.nextInt();
		}
	public void dis() {
		System.out.println("your idno"+this.byme);
		System.out.println("your name"+this.byme1);
	
		System.out.println("");	
		
	}
}*/
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int result = 0;

        while (number != 0) {
            int remainder = number % 10;
            result += Math.pow(remainder, 3);
            number /= 10;
        }

        if (result == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}
