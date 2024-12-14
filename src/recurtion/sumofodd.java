package recurtion;
import java.util.Scanner;
public class sumofodd {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in) ;
		int index=s.nextInt();
		int[] arr=new int[index];
		for(int i=0;i<index;i++) {
			arr[i]=s.nextInt();
		}
		int m=oddsum(arr,index-1);
		System.out.println("The sum of odd number is:"+m);
	}
	static int oddsum(int arr[],int n)
	{
		if(n<0) {
			return 0;
		}
		if(arr[n]%2!=0){
			return arr[n]+oddsum(arr,n-1);
			
		}else {
			return oddsum(arr,n-1);
		}
	}
}