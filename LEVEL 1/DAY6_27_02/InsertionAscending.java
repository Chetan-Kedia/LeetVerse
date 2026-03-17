public class InsertionAscending {

    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];//3|4|1|2
            int j = i - 1;//0|

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];//
                j--;//j = -1
            }//[5,5,4,1,2]

            arr[j + 1] = key;//
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};
        sort(arr);

        for (int num : arr)
            System.out.print(num + " ");
    }
}