package recurtion;

public class maximun {
		public static void main(String args[]) {
			int n=5;
			int a[]= {5,2,7,13,1};
			
			int m=maxvalue(a,n);
			System.out.println("The max value is:"+m);
		}
		static int maxvalue(int[] a,int n) {
			if(n==0) {
				return 0;
			}
			return Math.max(a[n-1],maxvalue(a,n-1));
			
		}
}
