import java.util.Scanner;
class MergeSort
{
    public static void mergeSort(int[] arr, int left, int right)
    {
        if (left >= right)
        {
            return;
        }
        int mid = left+(right - left)/2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);                            //logn
        merge(arr, left, mid, right);
    }
    public static void merge(int arr[], int left, int mid, int right)
    {
        int merged[] = new int[right-left+1];
        int idx1 = left;
        int idx2 = mid+1;
        int x = 0;
        while (idx1 <= mid && idx2 <= right) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }
        while (idx1 <= mid)
        {
            merged[x++] = arr[idx1++];
        }
        while (idx2 <= right)
        {
            merged[x++] = arr[idx2++];
        }
        for (int i = 0, j = left; i < merged.length; i++, j++)                 //n
        {
            arr[j] = merged[i];
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++)
        {
            System.out.print("Enter value at index "+i+": ");
            arr[i]=sc.nextInt();
        }
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array:");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}