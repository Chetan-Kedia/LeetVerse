import java.util.PriorityQueue;

public class minHeap {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(10);
        pq.add(20);
        pq.add(5);

        System.out.println("Priority Queue: " + pq);

        System.out.println("Peek element: " + pq.peek());

        System.out.println("Removed element: " + pq.poll());

        System.out.println("Queue after removal: " + pq);
    }
}
