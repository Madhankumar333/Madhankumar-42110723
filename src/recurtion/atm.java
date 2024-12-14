package recurtion;
import java.util.Scanner;
public class atm {
	public static void main(String args[]) 
	{
		System.out.print("Enter the pin:");
		Scanner s=new Scanner(System.in);
		int pin=s.nextInt();
		System.out.print("Enter the account no:");
		int acc=s.nextInt();
		System.out.print("Enter the balance:");
		int accbal=s.nextInt();
		atm e=new atm();
		e.withdraw(pin,accbal);
	}
	void withdraw(int p,int a) {
		int value=2005;
		if(p==value) 
		{
			System.out.print("Enter the amount:");
			Scanner m=new Scanner(System.in);
			int cash=m.nextInt();
			if(cash<10000 && cash<=a) 
			{
				a-=cash;
				System.out.println("Your balance after withdrawl is:"+a);
				System.out.println("THANK YOU...");
				
			}
			else if(cash>10000) 
			{
				System.out.println("Exceed the limit");
			}
			else if(cash>a) {
				System.out.println("Invalid balance");
			}
		}else {
			
			System.out.println("Invalid pin no.:");
		}
	}
}
