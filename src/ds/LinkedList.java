package ds;

class LinkedList {

    // Node class represents each element in the list.
    class Node {
        int data;
        Node next;

        // Constructor to initialize the node.
        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    Node head; // Head of the linked list

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
    }

    // Method to insert a node as the head of the list
    public void insertAsHead(int data) {

        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

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

    //Method to get the size of the list
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
        Node prev = null;
        Node next = null;
        while (current != null) {
            next = current.next;    // Store next.
            current.next = prev;    // Reverse the link.
            prev= current;          // Move prev to current.
            current = next;         // Move current to next.
        }
        head = prev;  // Update head to the last node.
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

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);
        linkedList.printList();
//        linkedList.insertAsHead(10);
//        linkedList.printList();
//        linkedList.delete(10);
//        linkedList.printList();
//        linkedList.delete(50);
//        linkedList.printList();
//        System.out.println(linkedList.search(50));
//        System.out.println(linkedList.size());
        linkedList.reverse();
        linkedList.printList();

    }
}

