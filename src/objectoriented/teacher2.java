
package objectoriented;
import java.util.Scanner;
public class teacher2 extends person1  {
	String su;
	int salary;
	teacher2(String su,int salary,String name,int age)
	{
		super(name,age);
		this.salary=salary;
		this.su=su;
	}
	void techinfo() {
		displayinfo();
		System.out.println(su+":"+salary);
	}
	float anum() {
		return salary * 12;
	}

}
