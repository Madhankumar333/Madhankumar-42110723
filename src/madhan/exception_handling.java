package madhan;
import java .io.*;
import java.util.Scanner;


/*class ExcepText {
    public static void main(String args[]) {
        try {
            int select;
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the Exception to be Handled");
            System.out.println("\n1. ArrayIndexOutOfBoundsException\n2. ArithmeticException");
            System.out.println("3. NullPointerException");
            select = in.nextInt();
            switch (select) {
                case 1: // ArrayIndexOutOfBoundsException
                    int[] arr = new int[2]; // Corrected array declaration
                    System.out.println("Access element three: " + arr[3]); // Corrected array index
                    break;
                case 2: // ArithmeticException
                    int num1 = 30, num2 = 0;
                    int output = num1 / num2; // Division by zero will throw ArithmeticException
                    System.out.println("Result=" + output);
                    break;
                case 3: // NullPointerException
                    String str = null;
                    System.out.println(str.length()); // Accessing length of a null string
                    break;
                default:
                    System.out.println("Invalid selection");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown: " + e);
        } catch (ArithmeticException e1) {
            System.out.println("Exception thrown: " + e1);
        } catch (NullPointerException e2) {
            System.out.println("Exception thrown: " + e2);
        } finally {
            System.out.println("Out of the block");
        }
    }
}*/
class ExcepText{
	public static void main(String srgs[]) {
		try {
	int select;
	Scanner s=new Scanner(System.in);
	System.out.println("1.arrayiut of bound exception");
	System.out.println("2.artimatic exception");
	System.out.println("3.null pointer exception");
	select =s.nextInt();
	switch(select) {
	case 1:
		int [] arr=new int [2];
		System.out.println("access element three="+arr[3]);
		break;
	case 2:
		int a=10,b=0;
		int c=a/b;
		System.out.println("result="+ c);
		break;
	case 3:
		String str=null;
		System.out.println("output"+str.length());
		break;
		default:
			System.out.println("invalid");
	
		}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("*"+e);
		}
			catch(ArithmeticException e1) {
				System.out.println("**"+e1);
			}
			
			
		
}
}

