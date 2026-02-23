public class Insertion{
    public static void main(String[] args) {

        int[] arr = new int[6];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        int n = 5;      // current size
        int pos = 2;    // insert position
        int value = 99;

        for(int i = n; i > pos; i--) {
            arr[i] = arr[i-1];
        }

        arr[pos] = value;
        n++;
        System.out.println("Array:");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}