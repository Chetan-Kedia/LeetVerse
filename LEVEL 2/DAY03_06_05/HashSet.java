import java.util.HashSet;
import java.util.Iterator;
public class HashSetMethodsDemo {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Java");
        System.out.println("After add(): " + set);
        set.remove("C++");
        System.out.println("After remove(): " + set);
        System.out.println("Contains Python? " + set.contains("Python"));
        System.out.println("Size: " + set.size());
        System.out.println("Is Empty? " + set.isEmpty());
        System.out.println("\nUsing For-Each Loop:");
        for (String language : set) {
            System.out.println(language);
        }
        System.out.println("\nUsing Iterator:");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        HashSet<String> set2 = new HashSet<>();
        set2.add("JavaScript");
        set2.add("Go");
        set.addAll(set2);
        System.out.println("\nAfter addAll(): " + set);
        HashSet<String> removeSet = new HashSet<>();
        removeSet.add("Go");
        set.removeAll(removeSet);
        System.out.println("After removeAll(): " + set);
        HashSet<String> retainSet = new HashSet<>();
        retainSet.add("Java");
        retainSet.add("Python");
        set.retainAll(retainSet);
        System.out.println("After retainAll(): " + set);
        HashSet<String> clonedSet =
                (HashSet<String>) set.clone();
        System.out.println("Cloned Set: " + clonedSet);
        Object[] arr = set.toArray();
        System.out.println("\nUsing toArray():");
        for (Object obj : arr) {
            System.out.println(obj);
        }
        System.out.println("\nContains All? "
                + set.containsAll(retainSet));
        System.out.println("Equals cloned set? "
                + set.equals(clonedSet));
        System.out.println("HashCode: "
                + set.hashCode());
        set.clear();
        System.out.println("\nAfter clear(): " + set);
        System.out.println("Is Empty Now? " + set.isEmpty());
    }
}
