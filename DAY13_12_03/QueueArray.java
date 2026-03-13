import java.util.*;
class QueueArray {
    int front, rear, size;
    int arr[];
    QueueArray(int s) {
        size = s;
        arr = new int[size];
        front = -1;
        rear = -1;
    }
    boolean isEmpty() {
        return front == -1;
    }
    boolean isFull() {
        return rear == size - 1;
    }
    void enqueue(int x) {
        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        rear++;
        arr[rear] = x;
        System.out.println(x + " inserted");
    }
    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println(arr[front] + " deleted");
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front++;
        }
    }
    void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        QueueArray q=new QueueArray(20);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        q.dequeue();
        q.display();
    }
}

