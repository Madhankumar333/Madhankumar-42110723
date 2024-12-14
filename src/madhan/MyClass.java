package madhan;

import java.util.Scanner;



/*class modern {
	String name;
	int age;
	void intro(){
	System.out.println("yourname is"+name+"and your age is"+age);	
	}
	}
	public class myclass{
		
	public static void main(String args[]) {
		myclass classs_1=new myclass();
		System.out.println("enter the name");
		Scanner s=new Scanner (System.in);
		String name=s.next();
		classs_1.name = name;
		
		System.out.println("enter the age");
		Scanner m=new Scanner(System.in);
		int age=m.nextInt();
		classs_1.age = age;
		classs_1.intro();
		}
	}
*/
import java.util.Scanner;

import java.util.Scanner;

class Modern {
    String name;
    int age;

    void intro() {
        System.out.println("Your name is " + name + " and your age is " + age);
    }
}

public class MyClass {
    public static void main(String[] args) {
        Modern Object = new Modern();

        System.out.println("Enter the name: ");
        Scanner anner = new Scanner(System.in);
        String n = anner.next();
        Object.name = n;

        System.out.println("Enter the age: ");
        int a = anner.nextInt();
        Object.age = a;

        Object.intro();
    }
}
