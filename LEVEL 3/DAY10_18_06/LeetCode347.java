import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Frequency map
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Bucket array (index = frequency)
        List<Integer>[] bucket = new ArrayList[nums.length + 1];
        
        for (int key : freqMap.keySet()) {
            int freq = freqMap.get(key);
            
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            
            bucket[freq].add(key);
        }

        // Step 3: Collect top k elements
        List<Integer> result = new ArrayList<>();
        
        for (int i = bucket.length - 1; i >= 0 && result.size() < k; i--) {
            if (bucket[i] != null) {
                result.addAll(bucket[i]);
            }
        }

        // Convert to array
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = result.get(i);
        }

        return res;
    }
}
