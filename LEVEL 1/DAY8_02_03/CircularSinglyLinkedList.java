class CircularSinglyLinkedList {
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next=null;
        }
    }
    Node head = null;

    // Insert at Beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        newNode.next = head;
        temp.next = newNode;
        head = newNode;
    }
    // Insert at End
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
    }
    // Delete from Beginning
    public void deleteFromBeginning() {
        if (head == null) return;
        if (head.next == head) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        //temp.next = head.next;
        head = head.next;
        temp.next=head;
    }
    // Delete from End
    public void deleteFromEnd() {
        if (head == null) return;
        if (head.next == head) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != head) {
            temp = temp.next;
        }
        temp.next = head;
    }
    // Display
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
    public static void main(String[] args) {
        CircularSinglyLinkedList list = new CircularSinglyLinkedList();
        list.insertAtBeginning(10);
        list.insertAtBeginning(5);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.display();
        list.deleteFromBeginning();
        list.display();
        list.deleteFromEnd();
        list.display();
    }
}