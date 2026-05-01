import java.util.Scanner;

public class ArrayMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        // Declaration
        int[] arr;
        // char[] arr3;

        // Initialisation
        arr = new int[]{34, 89, 23};
        int[] arr2 = {45, 23, 90};  // Direct Initialisation ( Declaration + Initialisation )
      
        arr = new int[5];
        System.out.println("Enter 5 numbers");
        for(int i = 0; i < 5; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(arr[2]);

        // Traversal
        // Indexed Traversal
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        // for-each loop
        for(int n : arr){
            System.out.println(n); // used only when we want to read the values not update, traveses each index internally
            // no ArrayIndexOutOfBoundsException here because we are not handling the indexes
        }

        // updating the value
        System.out.print("Enter the index to update: ");
        int idx = sc.nextInt();
        System.out.print("Enter the new value: ");
        arr[idx] = sc.nextInt();

        sc.close();
        
    }
}
