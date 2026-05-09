import java.util.HashMap;
import java.util.Map;
public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
    // Phase 1: build frequency map of all (a+b) sums — O(n^2)
    Map abMap = new HashMap<>();
    for (int a : nums1)
      for (int b : nums2)
        abMap.merge(a + b, 1, Integer::sum);
    // Phase 2: for each (c+d), look up -(c+d) — O(n^2)
    int count = 0;
    for (int c : nums3)
      for (int d : nums4)
        count += abMap.getOrDefault(-(c + d), 0);
    return count;
}
