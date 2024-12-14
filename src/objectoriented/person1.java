package objectoriented;
import java.util.Scanner;
public class person1 {
	
		String name;
		int age;
		person1(String name,int age){
			this.name=name;
			this.age=age;
		}
		void displayinfo() 
		{
			System.out.println(name+":"+age+" ");
		}
	
}
