import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinHeap {
    private List<Integer> heap;

    public MinHeap() {
        this.heap = new ArrayList<>();
    }

    // Helper methods to calculate parent and child indices
    private int getParentIndex(int i) { return (i - 1) / 2; }
    private int getLeftChildIndex(int i) { return 2 * i + 1; }
    private int getRightChildIndex(int i) { return 2 * i + 2; }

    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    /**
     * 1. INSERT / BUILD (Up-Heap / Bubble-Up)
     * Time Complexity: O(log n)
     */
    public void insert(int value) {
        // Step 1: Add element to the end of the list
        heap.add(value);
        // Step 2: Bubble it up to restore heap property
        heapifyUp(heap.size() - 1);
    }

    private void heapifyUp(int index) {
        int currentIndex = index;
        int parentIndex = getParentIndex(currentIndex);

        // While we aren't at the root and the parent is greater than the current node
        while (currentIndex > 0 && heap.get(parentIndex) > heap.get(currentIndex)) {
            swap(parentIndex, currentIndex);
            currentIndex = parentIndex;
            parentIndex = getParentIndex(currentIndex);
        }
    }

    /**
     * 2. DELETE MIN (Extract Min)
     * Time Complexity: O(log n)
     */
    public Integer deleteMin() {
        if (heap.isEmpty()) return null;
        if (heap.size() == 1) return heap.remove(0);

        int min = heap.get(0);
        
        // Step 1: Replace root with the last element
        int lastElement = heap.remove(heap.size() - 1);
        heap.set(0, lastElement);
        
        // Step 2: Push it down to its correct position
        heapifyDown(0, heap.size());
        
        return min;
    }

    /**
     *  3. HEAPIFY (Down-Heap / Bubble-Down)
     * Time Complexity: O(log n)
     */
    public void heapifyDown(int index, int heapSize) {
        int currentIndex = index;
        
        while (getLeftChildIndex(currentIndex) < heapSize) {
            int leftChild = getLeftChildIndex(currentIndex);
            int rightChild = getRightChildIndex(currentIndex);
            int smallestChild = leftChild;

            // If right child exists and is smaller than the left child, track it
            if (rightChild < heapSize && heap.get(rightChild) < heap.get(leftChild)) {
                smallestChild = rightChild;
            }

            // If the parent is already smaller than its smallest child, we're done
            if (heap.get(currentIndex) <= heap.get(smallestChild)) {
                break;
            }

            // Otherwise, swap and continue drifting down
            swap(currentIndex, smallestChild);
            currentIndex = smallestChild;
        }
    }

    /**
     * BUILD HEAP (Bottom-up approach from an unsorted array)
     * Time Complexity: O(n)
     */
    public void buildHeap(int[] array) {
        heap.clear();
        for (int val : array) {
            heap.add(val);
        }
        
        // Start from the last internal node and heapify down to the root
        int lastParent = (heap.size() / 2) - 1;
        for (int i = lastParent; i >= 0; i--) {
            heapifyDown(i, heap.size());
        }
    }

    /**
     * 4. HEAP SORT (Ascending Order)
     * Time Complexity: O(n log n)
     */
    public static int[] heapSort(int[] array) {
        MinHeap minHeap = new MinHeap();
        minHeap.buildHeap(array);
        
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = minHeap.deleteMin();
        }
        
        return sortedArray;
    }

    public void printHeap() {
        System.out.println(heap);
    }

    // Main method to demonstrate the operations
    public static void main(String[] args) {
        int[] exampleData = {3, 1, 6, 5, 2, 4};
        
        System.out.println("Original Array: " + Arrays.toString(exampleData));
        
        // Demo Heap Sort
        int[] sorted = heapSort(exampleData);
        System.out.println("Sorted Array  : " + Arrays.toString(sorted));
    }
}
