package static_usage;

import java.util.Arrays;

public class UtilityMethod {
    public static void main(String[] args) {

        // Math is a class in which max is a utility method
        System.out.println(Math.max(10, 20));

        // for parsing string to int there is a utility function in Integer class
        System.out.println(Integer.parseInt("123"));
        System.out.println(String.valueOf(45));

        int[] arr = new int[]{4, 2, 1, 7,};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
