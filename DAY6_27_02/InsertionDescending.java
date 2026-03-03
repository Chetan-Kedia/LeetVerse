
public class InsertionDescending {
    static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];//3
            int j = i - 1;//j=0
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;//[5,3,4,1,2]
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        sort(arr);

        for (int num : arr)
            System.out.print(num + " ");
    }
}