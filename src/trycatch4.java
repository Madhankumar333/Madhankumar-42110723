import java.util.Scanner;
public class trycatch4 {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.print("Eneter the no.of subjects:");
		int m=s.nextInt();
		int[] arr=new int[m];
		try {
		for(int i=0;i<m;i++) {
			System.out.print("Enter the grades of the  subject ("+i+") =");
			arr[i]=s.nextInt();
			}
		}catch(Exception e) {
			System.out.println("Error array index out of :bound");
		}
		System.out.println("Eneter the sub number");
		int n=s.nextInt();
		try { 
		for(int i=0;i<m;i++) {
			if(arr[i]==arr[n]) {
				System.out.println("The grage of the subject "+ n +"is = "+arr[n]);
			}
		}
		}catch(ArrayIndexOutOfBoundsException  e) {
			System.out.println("Error array index out of ::bound");
		}
	}
}
