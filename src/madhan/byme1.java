package madhan;

import java.util.Scanner;

public class byme1 {
	public static void main(String args[]) {
		int []a= {1,2,3,4,6,8,9};
		System.out.println("enter the element to be found");
		Scanner s= new Scanner(System.in);
		int m= s.nextInt();
		for(int i=0;i<a.length;i++) {
			if(a[i]==m) {
				System.out.println("elemant found at the index ="+i);
			}
			//System.out.println(a[i]);
		}
		
	}
}
