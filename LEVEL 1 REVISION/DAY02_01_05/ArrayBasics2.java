import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        
        // sort()
        int[] arr = {23, 1, -6, 78, 12};
        Arrays.sort(arr);  // O(n log n complexity) uses DualPivotQuicksort 
        System.out.println(Arrays.toString(arr));  // toString Method uses String Builder to convert an array to string
        System.out.println(arr.length); // a final made variable that holds the size of array

        // fill
        arr = new int[10];
        Arrays.fill(arr, -1); // fills the array with the number given
        System.out.println(Arrays.toString(arr));
        Arrays.fill(arr, 2, 5, 0);  // fills the idx from 2 to 5 with 0
        System.out.println(Arrays.toString(arr));

        // binarySearch
        arr = new int[]{1, 4, 5, 6, 10, 57, 90};
        System.out.println(Arrays.binarySearch(arr, 7)); // returns -(idx where it should be) - 1 in case the value not found
        // if found then returns the index

        // copyOf
        arr = new int[]{2, 4, 34, 12, 89, 67, 45, 90, 34};
        int[] arrCopy = Arrays.copyOf(arr, 4); // make a copy of the array upto the length given, if given length is more then the original length then rest space is Initialised with default value of that data type
        System.out.println(Arrays.toString(arrCopy));

        // equals
        int[] arr1 = {1, 3, 4};
        int[] arr2 = {1, 3, 4};
        // System.out.println(arr1 == arr2); // compares the address so false
        System.out.println(Arrays.equals(arr1, arr2)); // compares each index

    }
}
