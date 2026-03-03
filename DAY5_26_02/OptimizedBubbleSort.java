import java.util.Scanner;

public class OptimizedBubbleSort {
    // Optimized Bubble Sort Function
    static void bubbleSort(int[] arr, int n) {
        boolean swapped;
        for(int i = 0; i < n-1; i++) {     // number of passes
            swapped = false;               // assume no swaps
            for(int j = 0; j < n-i-1; j++) {   // comparisons
                if(arr[j] > arr[j+1]) {
                    // swap elements
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;        // swap happened
                }
            }
            // if no swaps in a full pass → already sorted
            if(swapped == false) {
                break;
            }
        }
    }
    // Print array
    static void printArray(int[] arr, int n) {
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr, n);
        System.out.println("Sorted Array:");
        printArray(arr, n);
    }
}
