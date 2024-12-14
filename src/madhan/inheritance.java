package madhan;
import java.util.Scanner;

public class inheritance {
	public static void main(String args[]) {
//		int x=2;
//		System.out.print("enter the value: ");
//		Scanner s=new Scanner(System.in);
//		int v=s.nextInt();
//		int f,m,l;
//		l=v%10;
//		f=v/100;
//		m=(v%100)/10;
//		if(f%x==0) {
//			System.out.println("it is divisible");
//		}
//		else {
//			System.out.println("it is not diviible");
//		}
//		if(m%x==0) {
//			System.out.println("it is divisible");
//			
//		}
//		else {
//			System.out.println("it is not diviible");
//		}
//		if(l%x==0) {
//			System.out.println("it is divisible");
//		}
//		else {
//			System.out.println("it is not diviible");
//		}
////		int remainder2=f/x;
////		int remainder3=m/x;
////		System.out.println("answer1: "+remainder1+" anser2: "+remainder2+" answer3: "+remainder3);
//		System.out.println("value1: "+f+" value2: "+m+" value3: "+l);
////		
//	/
//		for(int i=1;i<=10;i++) {
//		 int j=(5*i);
//		System.out.println("5 x "+i+"="+j);
		 
		        int n = 5; // Example value for n
		        for (int i = 1; i < 2 * n; i++) {
		            int star;
		            if (i <= n) {
		                star = i;
		            } else {
		                star = 2 * n - i;
		            }

		            for (int j = 0; j < star; j++) {
		                System.out.print("*");
		            }
		            System.out.println();
		        }
		    }
		}
	


