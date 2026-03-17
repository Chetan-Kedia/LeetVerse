class ReverseSingly {

    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    Node head = null;

    void insert(int data) {
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

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void reverse() {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        ReverseSingly list = new ReverseSingly();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.display();
        list.reverse();
        list.display();
    }
}