import java.util.Scanner;

public class BubbleSort {
    // Bubble Sort function
    static void bubbleSort(int[] arr, int n) {
        for(int i = 0; i < n-1; i++) {          // number of passes
            for(int j = 0; j < n-i-1; j++) {    // comparisons
                if(arr[j] > arr[j+1]) {
                    // swapping
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    // printing array
    static void printArray(int[] arr, int n) {
        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        bubbleSort(arr, n);
        System.out.println("Sorted array:");
        printArray(arr, n);
    }
}
