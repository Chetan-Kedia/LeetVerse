import java.util.Deque;
import java.util.ArrayDeque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        // Add elements
        dq.addFirst(10);   // add at front
        dq.addLast(20);    // add at rear
        dq.offerFirst(5);  // add at front
        dq.offerLast(25);  // add at rear
        System.out.println("Deque: " + dq);
        // Access elements
        System.out.println("First: " + dq.getFirst());
        System.out.println("Last: " + dq.getLast());
        // Remove elements
        dq.removeFirst();
        dq.removeLast();
        System.out.println("After removal: " + dq);
        // Peek (without removing)
        System.out.println("Peek First: " + dq.peekFirst());
        System.out.println("Peek Last: " + dq.peekLast());
        // Check size
        System.out.println("Size: " + dq.size());
        // Check empty
        System.out.println("Is Empty: " + dq.isEmpty());
    }
}