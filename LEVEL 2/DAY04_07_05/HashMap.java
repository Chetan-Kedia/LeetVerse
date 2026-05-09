import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        // CREATING A HASHMAP
        HashMap<String, Integer> marks = new HashMap<>();
        System.out.println("=== HashMap Created ===");
        System.out.println("Is empty? " + marks.isEmpty());      // true
        System.out.println("Size: "     + marks.size());         // 0

        // 1. put(key, value)  — add entries
        marks.put("Rahul", 85);
        marks.put("Priya", 92);
        marks.put("Amit",  78);
        marks.put("Sara",  88);
        System.out.println("\n=== After put() ===");
        System.out.println(marks);                               // {Rahul=85, Priya=92, ...}

        int Marks = marks.put("Rahul", 90);
        System.out.println("Rahul's marks: " + Marks); 
        System.out.println("Rahul's marks: " + marks.get("Rahul")); 

        // 2. get(key)  — fetch value
       
        System.out.println("\n=== get() ===");
        System.out.println("Priya: " + marks.get("Priya"));     // 92
        System.out.println("Missing key: " + marks.get("XYZ")); 

        // 3. getOrDefault(key, default)  — safe get
        System.out.println("\n=== getOrDefault() ===");
        int score = marks.getOrDefault("XYZ", 0);
        System.out.println("XYZ score (default 0): " + score);  // 0
       
        // 4. containsKey(key)  — O(1) check
        System.out.println("\n=== containsKey() ===");
        System.out.println("Has Rahul? " + marks.containsKey("Rahul")); // true
        System.out.println("Has XYZ?   " + marks.containsKey("XYZ"));   // false

        // 5. containsValue(value)  — O(n) check
        System.out.println("\n=== containsValue() ===");
        System.out.println("Has 92?  " + marks.containsValue(92));   // true
        System.out.println("Has 100? " + marks.containsValue(100));  // false

        // 6. putIfAbsent(key, value)
        System.out.println("\n=== putIfAbsent() ===");
        marks.putIfAbsent("Rahul", 999);   // Rahul exists → NO change
        marks.putIfAbsent("John",   70);   // John missing → ADDED
        System.out.println("Rahul (should still be 90): " + marks.get("Rahul")); // 90
        System.out.println("John (newly added):          " + marks.get("John"));  // 70
       
        // 7. replace(key, value)
        System.out.println("\n=== replace() ===");
        marks.replace("Amit", 95);          // Amit exists → updated
        marks.replace("Ghost", 50);         // Ghost missing → nothing happens
        System.out.println("Amit (replaced): " + marks.get("Amit"));   // 95
        System.out.println("Ghost:           " + marks.get("Ghost"));  // null

        int value = marks.replace("Amit", 100);
        System.out.println("Amit's old value: " + value); 

        // 8. remove(key)  and  remove(key, value)
        System.out.println("\n=== remove() ===");
        marks.remove("John");                          // removes John entry
        System.out.println("After remove(John): " + marks.get("John")); // null

        boolean removed = marks.remove("Sara", 88);    // exact match → removed
        boolean notRemoved = marks.remove("Priya", 0); // wrong value → NOT removed
        System.out.println("Sara removed (exact match):   " + removed);     // true
        System.out.println("Priya removed (wrong value):  " + notRemoved);  // false

        // 9. size() and isEmpty()
        System.out.println("\n=== size() & isEmpty() ===");
        System.out.println("Size: "     + marks.size());      // 3
        System.out.println("Is empty? " + marks.isEmpty());   // false
       
        // 10. keySet()  — iterate only keys
        System.out.println("\n=== keySet() ===");
        for (String name : marks.keySet()) {
            System.out.println("Key: " + name);
        }

        // 11. values()  — iterate only values
        System.out.println("\n=== values() ===");
        for (int val : marks.values()) {
            System.out.println("Value: " + val);
        }
       
        // 12. entrySet()  — iterate key + value (BEST)
        System.out.println("\n=== entrySet() ===");
        for (Map.Entry<String, Integer> entry : marks.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // 13. forEach()  — lambda style (Java 8+)
        System.out.println("\n=== forEach() ===");
        marks.forEach((name, val) -> System.out.println(name + " scored " + val));

        // 14. clear()
        System.out.println("\n=== clear() ===");
        marks.clear();
        System.out.println("After clear → size: " + marks.size());       // 0
        System.out.println("After clear → empty: " + marks.isEmpty());   // true

        // BONUS: Frequency Count Pattern (Interview Favourite)
        System.out.println("\n=== Frequency Count Pattern ===");
        String str = "abracadabra";
        HashMap<Character, Integer> freq = new HashMap<>();

        for (char c : str.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        System.out.println("String: " + str);
        System.out.println("Frequency: " + freq); // {a=5, b=2, r=2, c=1, d=1}
    }
}
