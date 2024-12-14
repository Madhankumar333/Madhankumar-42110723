import java.util.Scanner;
public class trycatch {
	public static void main (String args[]) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		String arr[];
		s.nextLine();
		arr=new String[a];
		for(int i=0;i<a;i++)
		{
			String t=s.nextLine();
			arr[i]=(t.isEmpty())?null:t;
		}
		for(int i=0;i<a;i++)
		{
			try {
				if(arr[i]==null) {
					throw new Exception();
				}
			System.out.println(arr[i]);
		}catch(Exception e){
			System.out.println("no feed back");
			
		}
		}
	}

}
