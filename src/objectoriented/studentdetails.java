package objectoriented;
import java.util.Scanner;
class StudentDetails {
    String name;
    int id;
    String dep;


    StudentDetails() {
        this.name = "Unknown";
        this.id = 0;
        this.dep = "Unknown";
    }

    
    void display1() {
        System.out.println("****STUDENT DETAILS****");
        System.out.println("NAME: " + name);
        System.out.println("ID: " + id);
        System.out.println("DEPARTMENT: " + dep);
    }
}
