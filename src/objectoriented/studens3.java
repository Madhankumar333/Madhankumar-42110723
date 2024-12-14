package objectoriented;
import java.util.Scanner;
public class studens3 extends person1{
	int grade,id;
	studens3(int grade,int id,String name,int age)
	{
		super(name,age);
		this.grade=grade;
		this.id=id;
	}
	void studentinfo() {
		displayinfo();
		System.out.println(grade+":"+id);
		
	}
	float grade() {
		return grade*5;
	}
}
