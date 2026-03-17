public class Merge {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        int size1 = arr1.length;
        int size2 = arr2.length;

        int[] merged = new int[size1 + size2];

        // Copy first array
        for(int i = 0; i < size1; i++) {
            merged[i] = arr1[i];
        }

        // Copy second array
        for(int i = 0; i < size2; i++) {
            merged[size1 + i] = arr2[i];
        }

        System.out.println("Merged Array:");
        for(int num : merged) {
            System.out.print(num + " ");
        }
    }
}
