public class Traversal1D {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 6, 7};
        System.out.println("Array Element in Forward :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nArray Element in Backword");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nUsing Enhance For:");
        for(int num : arr) {
            System.out.print(num +" ");
        }
    }
}
