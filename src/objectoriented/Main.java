package objectoriented;
import java.util.Scanner;
public class Main {
		public static void main(String args[]) {
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the movie name : ");
			String title=s.next();
			System.out.println("Enter the director name : ");
			String director=s.next();
			System.out.println("Enter the genre: ");
			String genre=s.next();
			System.out.println("Enter the rateing : ");
			double rateing=s.nextDouble();
			sol_1oopsMovie m= new sol_1oopsMovie(title, director, genre, rateing);
			m.display();
			m.update(8.2);
			
			Employee e1,e2;
			e1=new Employee(24,"ss","biriyani",250.0f);
			e2=new Employee(2,"salem","biriyani",255.0f);
			e1.display();
			e2.display();
			System.out.println("salary of "+e1.name+" is "+e1.annam());
			teacher2 t1,t2;
			studens3 s1,s2;
			t1=new teacher2("biology",20000,"parthiban",31);
			s1=new studens3(100,19,"madhan",19);
			s1.studentinfo();
			t1.techinfo();
		}
}
