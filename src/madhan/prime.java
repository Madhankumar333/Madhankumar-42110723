package madhan;
import java.util.Scanner;
public class prime {
	    public static void main(String args[]) {
//	        Scanner s = new Scanner(System.in);
//	        int a = s.nextInt();
//	        for (int i = 2; i <= a; i++) {
//	            int b = 0;
//	            for (int j = 2; j < i; j++) {
//	                if (i % j == 0) {
//	                    b = 1;
//	                    break;
//	                }
//	            }
//	            if (b == 0) {
//	                System.out.print(i + " ");
//	            }
//	        }
	            Scanner s = new Scanner(System.in);
	            
	            int n = s.nextInt();
	            int[] arr = new int[n];
	            
	            for (int i = 0; i < n; i++) {
	                arr[i] = s.nextInt();
	            }
	            
	            int uniqueCount = 0;
	            
	            for (int i = 0; i < n; i++) {
	                boolean isDuplicate = false;
	                for (int j = 1; j < i; j++) {
	                    if (arr[i] == arr[j]) {
	                        isDuplicate = true;
	                        break;
	                    }
	                }
	                if (!isDuplicate) {
	                    arr[uniqueCount] = arr[i];
	                    uniqueCount++;
	                }
	            }
	            
	            for (int i = 0; i < uniqueCount; i++) {
	                System.out.println(arr[i]);
	            }

	            s.close();
	    }
	}
