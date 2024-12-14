package DataStructures;

public class LinkedListBasic {

    
    class Node1 {
        int data;
        Node1 next;
    }

    
    private Node1 head = null;
    private Node1 temp = null;

    
    public void insert(int d) { 
        Node1 n = new Node1();
        n.data = d;
        n.next = null;

        if (head == null) {
            head = n;
            temp = n;
        } else {
            temp.next = n;
            temp = n;
        }
    }


    public void display() {
        Node1 t = head;
        while (t != null) {
            System.out.print(t.data + " -> ");
            t = t.next;
        }
        System.out.println("null");
    }
}

