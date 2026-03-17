import java.util.*;

class Student {
    int marks;

    Student(int marks) {
        this.marks = marks;
    }
}

public class main2 {

    public static void main(String[] args) {

        PriorityQueue<Student> pq =
                new PriorityQueue<>((a, b) -> b.marks - a.marks);

        // Adding students
        pq.add(new Student(80));
        pq.add(new Student(90));
        pq.add(new Student(70));
        pq.add(new Student(85));

        // Printing removal order
        while (!pq.isEmpty()) {
            System.out.println(pq.poll().marks);
        }
    }
}