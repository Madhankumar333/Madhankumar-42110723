package madhan;
import java.util.*;
import java.util.Scanner;
class a extends Thread{
	public void run() {
		for (int i=1;i<10;i++) {
			System.out.println("hi");
		}
	}
}
	class b extends Thread
	                 {
		public void run() {
			for(int i=1;i<=10;i++) {
				System.out.println("helo");
			}
		}
	
	public static void main(String args[]) {
		a ob1=new a();
		
		b ob2=new b();
		ob2.start();
		ob1.start();
	}
	                 }

