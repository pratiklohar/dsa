package ds;

public class DoublyLinkedList {

    // Node class represents each element in the list.
    class Node {
        int data;
        Node next;
        Node prev;

        // Constructor to initialize the node.
        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head; // Head of the DLL.

    //Method to insert a node at the end of the list.
    public void insert(int data) {

        Node newNode = new Node(data);

        // Inserting node for the first time.
        if (head == null) {
            head = newNode;
            return;
        }

        // Inserting node at the end, if node exist.
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Method to insert a node as the head of the list
    public void insertAsHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Method to print the list.
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Method to delete a node.
    public void delete(int data) {

        // If node to be deleted is head node.
        if (head.data == data) {
            head = head.next;
            return;
        }

        // If node to be deleted is in the middle or in the end.
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            if (temp.data == data) {
                prev.next = temp.next;
                temp.next.prev = prev;
                return;
            }
            prev = temp;
            temp = temp.next;
        }

        //If node to be deleted does not exist in the list
        System.out.println("Node does not exist in the list.");

    }

    // Method to search a node in the list.
    public boolean search(int data) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == data) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    // Method to get the size of the list
    public int size() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Reverse the linked list
    public void reverse() {
        Node current = head;
        Node temp = null;
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        if (temp != null) {
            head = temp.prev;  // Update the head.
        }
    }

    public static void main(String[] args) {

        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.insert(20);
        doublyLinkedList.insert(30);
        doublyLinkedList.insert(40);
        doublyLinkedList.printList();
        doublyLinkedList.insertAsHead(10);
        doublyLinkedList.printList();
        doublyLinkedList.delete(30);
        doublyLinkedList.printList();
        doublyLinkedList.reverse();
    }
}
