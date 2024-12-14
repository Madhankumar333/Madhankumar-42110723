//import java.util.Scanner;
//public class ll1 {
//	int data;
//	ll1 next;
// void ll1(int data){
//	 this.data=data;
//	 this.next=null;
// }
//class LL{
//	ll1 head;
//	public void tala() {
//		head=null;
//	}
//	public void add() {
//		ll1 momo=new ll1();
//		
//	if(head==null) {
//		head = momo;
//	}else {
//		ll1 curr=head;
//		while (curr.next != null) {
//            curr = curr.next;
//		}
//	}
//	
//}
//}
//}
// Define the Node class to represent each element in the list
class Node {
    int data;  // This stores the data of the node
    Node next; // This stores the reference to the next node in the list

    // Constructor to initialize a new node with data and null as the next node
    public Node(int data) {
        this  .data = data;
        this.next = null;
    }
}

// Define the LinkedList class that will manage the list
class LinkedList {
    Node head; // The head of the list, which is the first node

    // Constructor to initialize the linked list with an empty head
    public LinkedList() {
        head = null;
    }

    // Method to add a node at the end of the list
    public void add(int data) {
        Node newNode = new Node(data);  // Create a new node with the given data
        if (head == null) {  // If the list is empty, make the new node the head
            head = newNode;
        } else {
            Node current = head;
            // Traverse the list to find the last node
            while (current.next != null) {
                current = current.next;
            }
            // Link the new node to the last node's next reference
            current.next = newNode;
        }
    }

    // Method to display the list
    public void display() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        Node current = head;
        // Traverse the list and print each node's data
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();  // For a newline after displaying all elements
    }

    // Method to delete a node with a specific value
    public void delete(int value) {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        
        // If the node to delete is the head node
        if (head.data == value) {
            head = head.next;  // Move the head to the next node
            System.out.println("Node with value " + value + " deleted.");
            return;
        }

        // Traverse the list to find the node to delete
        Node current = head;
        while (current.next != null) {
            if (current.next.data == value) {
                current.next = current.next.next;  // Remove the node
                System.out.println("Node with value " + value + " deleted.");
                return;
            }
            current = current.next;
        }

        // If the node is not found
        System.out.println("Node with value " + value + " not found.");
    }

    // Method to search for a value in the list
    public boolean search(int value) {
        Node current = head;
        while (current != null) {
            if (current.data == value) {
                return true;  // Value found
            }
            current = current.next;
        }
        return false;  // Value not found
    }

    // Method to find the size of the list (number of nodes)
    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}

// Main class to test the LinkedList
public class ll1 {
    public static void main(String[] args) {
        // Create a new LinkedList object
        LinkedList list = new LinkedList();

        // Add elements to the list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // Display the list
        System.out.println("Linked List after adding elements:");
        list.display();

        // Delete an element
        list.delete(20);

        // Display the list after deletion
        System.out.println("Linked List after deleting element 20:");
        list.display();

        // Search for an element
        System.out.println("Searching for 30: " + (list.search(30) ? "Found" : "Not Found"));
        System.out.println("Searching for 50: " + (list.search(50) ? "Found" : "Not Found"));

        // Display the size of the list
        System.out.println("Size of the list: " +list.size());
    }
}
