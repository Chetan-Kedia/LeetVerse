import java.util.*;

public class ArrayListMain {
    public static void main(String[] args) {

        // Declaration
        List<String> fruits = new ArrayList<>();
        // fruits = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>(); // default constructor (Initial Capacity = 0)

        // all constructors of array list
        // ArrayList<Integer> scores = new ArrayList<>(100); // (initialCapacity = 100)

        // // constructor for converting one interface to another
        // Set<String> uniqueNames = Set.of("Alice", "Bob", "Charlie");
        // ArrayList<String> nameList = new ArrayList<>(uniqueNames);

        // adding elements
        list.add(1);
        list.add(67);
        list.add(1, 56);
        list.add(78);
        fruits.add("mango");
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("mango");

        // accessing elemets
        System.out.println(list.get(1));
        System.out.println(list.getLast());
        System.out.println(list.getFirst());
        System.out.println(list.get(0));

        // Modifying/Updating values
        list.set(1, 778);
        System.out.println(list);
        System.out.println(list.set(3, 777)); // will return old value of that idx
        System.out.println(list);

        // element is contained ?
        System.out.println(list.contains(777));
        System.out.println(list.contains(673));

        // getting the size of the ArrayList
        System.out.println(list.size()); // size() is a getter fn for size of an arrayList

        // removing elements from arrayList
        System.out.println(list.remove(2));
        System.out.println(fruits.remove("banana"));
        System.out.println(list);

        // indexOf of an object entry
        System.out.println(fruits.indexOf("apple")); // Returns the index of the first occurrence, or -1 if not found
        System.out.println(fruits.lastIndexOf("mango")); // Returns the index of the last occurrence, or -1 if not found.

        // emptiness of list
        System.out.println(list.isEmpty()); // false

        // iteration
        System.out.println("Using traditional for loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("Using enhanced for loop:");
        for (int num : list) {
            System.out.println(num);
        }

        System.out.println("Using Iterator:");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // clear
        list.clear();
        System.out.println(list.isEmpty()); // true

    }
}
