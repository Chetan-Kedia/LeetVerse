public class DoublyLL {
    private Node head;
    private Node tail;
    private int size = 0;


    // Insertions

    // this method adds a new node at the beginning of the list
    public void addFirst(int val) {
        Node newNode = new Node(val);
        if(head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        System.out.println("Added " + val + " at the beginning of the list");
        size++;
    }

    // this method adds a new node at the end of the list
    public void addLast(int val) {
        Node newNode = new Node(val);
        if(tail == null) head = tail = newNode;
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        System.out.println("Added " + val + " at the end of the list");
        size++;
    }

    // this method adds a new node at the given index
    public void add(int val, int idx) {
        if(idx == 0) {
            addFirst(val);
            return;
        }

        if(idx == size) {
            addLast(val);
            return;
        }

        Node newNode = new Node(val);
        Node temp = head;
        for(int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
        size++;
        System.out.println("Added " + val + " at index " + idx);
    }


    // Deletions
    // this method removes the first node of the list
    public void removeFirst() {
        if(head == null) {
            System.out.println("List is empty");
            return;
        };
        if(head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    // this method removes the last node of the list
    public void removeLast() {
        if(tail == null) {
            System.out.println("List is empty");
            return;
        }
        if(head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    // this method removes the node at the given index
    public void remove(int idx) {

        if(idx > size - 1 || idx < 0) {
            System.out.println("Invalid index");
            return;
        }

        if(idx == 0) {
            removeFirst();
            return;
        }

        if(idx == size - 1) {
            removeLast();
            return;
        }

        Node temp = head;
        for(int i = 0; i < idx; i++) {
            temp = temp.next;
        }

        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        size--;
    }

    // this method returns the value of the node at the given index
    public int get(int idx) {
        if(idx > size - 1 || idx < 0) {
            System.out.println("Invalid index");
            return -1;
        }

        Node temp = head;
        for(int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    // this method finds the index of the first occurrence of the given value
    public void find(int val) {
        Node temp = head;
        int idx = 0;
        while(temp != null) {
            if(temp.val == val) {
                System.out.println("Value " + val + " found at index " + idx);
                return;
            }
            temp = temp.next;
            idx++;
        }
        System.out.println("Value " + val + " not found in the list");
    }

    public void display() {
        Node node = head;
        while(node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.println("END");
    }

    public int size() {
        return size;
    }


   static class Node {
      int val;
      Node prev;
      Node next;

      public Node(int val) {
          this.val = val;
      }

      public Node(int val, Node prev, Node next) {
          this.val = val;
          this.prev = prev;
          this.next = next;
      }
  }
   public static void main(String args[]) {
        DoublyLL dll = new DoublyLL();
        dll.addFirst(10);
        dll.addLast(20);
        dll.add(15, 1);
        dll.display();
        dll.removeFirst();
        dll.display();
        dll.removeLast();
        dll.display();
        System.out.println("Size of the list: " + dll.size());
        System.out.println("Value at index 0: " + dll.get(0));
        dll.find(15);
    }
}
