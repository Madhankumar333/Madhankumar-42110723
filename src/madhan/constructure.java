package madhan;
/*class person{
	int age;
	String name;
	person(){
		age=10;
		name="me";
	}
	person(int age,String name){
		this.age=age;
		this.name=name;
		
	}
	person(person other){
		this.age=other.age;
		this.name=other.name;
	}
	void display() {
		System.out.println("your age is "+age);
		System.out.println("your name is "+name);
	}
}
public class constructure {
	public static void main(String[] args) {
		person person1=new person();
		person person2=new person(19,"ace");
		person person3=new person(person2);
		System.out.println("Person 1:");
		 person1.display();
        System.out.println("person2:");
        person2.display();
        System.out.println("Person 3:");
        person3.display();
	}
}
*/
class Person {
    String name;
    int age;

    // Default constructor
    Person() {
        name = "John Doe";
        age = 0;
    }

    // Parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Method to display person details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class constructure {
    public static void main(String[] args) {
        // Creating objects using different constructors
        Person person1 = new Person();
        Person person2 = new Person("Alice", 25);
        Person person3 = new Person(person2);

        // Displaying person details
        System.out.println("Person 1:");
        person1.displayDetails();

        System.out.println("Person 2:");
        person2.displayDetails();

        System.out.println("Person 3:");
        person3.displayDetails();
    }
}
