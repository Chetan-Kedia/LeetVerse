public class Reverse1D {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int temp = arr[start];// temp=2
            arr[start] = arr[end];//{5,4,3,4,5}
            arr[end] = temp;//5,2,3,2,1

            start++;//2
            end--;//2
        }

        for(int num : arr)
            System.out.print(num + " ");
    }
}