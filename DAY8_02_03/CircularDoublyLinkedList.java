class CircularDoublyLinkedList {
    class Node {
        int data;
        Node next;
        Node prev;
        Node(int data) {
            this.data = data;
        }
    }
    Node head = null;
    // Insert at Beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
            return;
        }
        Node last = head.prev;
        newNode.next = head;
        newNode.prev = last;
        last.next = newNode;
        head.prev = newNode;
        head = newNode;
    }
    // Insert at End
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
            return;
        }
        Node last = head.prev;
        last.next = newNode;
        newNode.prev = last;
        newNode.next = head;
        head.prev = newNode;
    }
    // Delete from Beginning
    public void deleteFromBeginning() {
        if (head == null) return;
        if (head.next == head) {
            head = null;
            return;
        }
        Node last = head.prev;
        head = head.next;
        head.prev = last;
        last.next = head;
    }
    // Delete from End
    public void deleteFromEnd() {
        if (head == null) return;
        if (head.next == head) {
            head = null;
            return;
        }
        Node last = head.prev;
        Node secondLast = last.prev;
        secondLast.next = head;
        head.prev = secondLast;
    }
    // Display Forward
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
        CircularDoublyLinkedList list = new CircularDoublyLinkedList();
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