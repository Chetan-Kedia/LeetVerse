import java.util.Scanner;
class SinglyLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Invalid Position");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        head = head.next;
    }
    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }
    public void deleteByValue(int key) {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        if (head.data == key) {
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Value not found");
            return;
        }
        temp.next = temp.next.next;
    }
    public boolean search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key)
                return true;
            temp = temp.next;
        }
        return false;
    }
    public void display() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public int length() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n===== Singly Linked List Menu =====");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Insert at Position");
            System.out.println("4. Delete from Beginning");
            System.out.println("5. Delete from End");
            System.out.println("6. Delete by Value");
            System.out.println("7. Search");
            System.out.println("8. Display");
            System.out.println("9. Length");
            System.out.println("10. Reverse");
            System.out.println("11. Find Middle");
            System.out.println("0. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Data: ");
                    list.insertAtBeginning(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Enter Data: ");
                    list.insertAtEnd(sc.nextInt());
                    break;
                case 3:
                    System.out.print("Enter Data: ");
                    int data = sc.nextInt();
                    System.out.print("Enter Position: ");
                    int pos = sc.nextInt();
                    list.insertAtPosition(data, pos);
                    break;
                case 4:
                    list.deleteFromBeginning();
                    break;
                case 5:
                    list.deleteFromEnd();
                    break;
                case 6:
                    System.out.print("Enter Value to Delete: ");
                    list.deleteByValue(sc.nextInt());
                    break;
                case 7:
                    System.out.print("Enter Value to Search: ");
                    boolean found = list.search(sc.nextInt());
                    System.out.println(found ? "Found" : "Not Found");
                    break;
                case 8:
                    list.display();
                    break;
                case 9:
                    System.out.println("Length: " + list.length());
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } while (choice != 0);
        sc.close();
    }
}