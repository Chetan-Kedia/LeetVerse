import java.util.*;

class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int count = 0;

        for (int top = 0; top < rows; top++) {
            int[] colSum = new int[cols];
            for (int bottom = top; bottom < rows; bottom++) {

                // compress row `bottom` into colSum
                for (int c = 0; c < cols; c++) {
                    colSum[c] += matrix[bottom][c];
                }

                // LC·560 on colSum[] — O(n) instead of O(n²)
                HashMap<Integer,Integer> map = new HashMap<>();
                map.put(0, 1); // seed: empty subarray
                int prefix = 0;

                for (int val : colSum) {
                    prefix += val;
                    // how many previous prefixes = prefix - target?
                    count += map.getOrDefault(prefix - target, 0);
                    map.put(prefix,
                        map.getOrDefault(prefix, 0) + 1);
                }
            }
        }
        return count;
    }
}
