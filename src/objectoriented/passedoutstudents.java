package objectoriented;

import java.util.Scanner;
class PassedOutStudents extends StudentDetails {
    String thesis;

    PassedOutStudents(String name, int id, String dep, String thesis) {
        super.name = name;
        super.id = id;
        super.dep = dep;
        this.thesis = thesis;
    }

    public void display2() {
        System.out.println("Thesis Topic: " + thesis);
    }

   
    void display1() {
        super.display1();  
        display2();  
    }
}
