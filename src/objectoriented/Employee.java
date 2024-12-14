package objectoriented;
import java.util.Scanner;
public class Employee {
	int id;
	String name;
	String position;
	float salary;
	Employee(int id,String n,String p,float s){
		this.id=id;
		this.name=n;
		this.position=p;
		this.salary=s;
	}
	void display() 
	{
		System.out.println("id: "+id+"\n"+"name: "+name+"\n"+"position: "+position+"\n"+"salary: "+salary);

	}
	float annam() {
		return salary*12;
	}
}
