import java.util.Scanner;

public class Update{

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);

        System.out.println("Original Array:");
        for(int num : arr) {
            System.out.print(num + " ");
        }

        System.out.print("\nEnter index to update: ");
        int index = sc.nextInt();

        if(index >= 0 && index < arr.length) {

            System.out.print("Enter new value: ");
            int newValue = sc.nextInt();

            arr[index] = newValue;

            System.out.println("Updated Array:");
            for(int num : arr) {
                System.out.print(num + " ");
            }

        } else {
            System.out.println("Invalid Index!");
        }

        sc.close();
    }
}
