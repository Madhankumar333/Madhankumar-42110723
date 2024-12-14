package DataStructures;

public class Main1 {
    public static void main(String[] args) {
        LinkedListBasic linkedList = new LinkedListBasic();


        for (int i = 1; i <=5; i++) {
            linkedList.insert(i);
        }


        linkedList.display();
    }
}
