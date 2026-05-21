class Solution {
  public int[] maxSlidingWindow(int[] nums, int k) {
    int n = nums.length;
    int[] ans = new int[n - k + 1];
    Deque<Integer> dq = new ArrayDeque<>();
    int idx = 0;

    for (int i = 0; i < n; i++) {

      // Rule 1: evict expired front
      while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
        dq.pollFirst();
      }

      // Rule 2: discard useless smaller back elements
      while (!dq.isEmpty() &&
             nums[dq.peekLast()] < nums[i]) {
        dq.pollLast();
      }

      dq.offerLast(i);

      // Rule 3: record answer once window is full
      if (i >= k - 1) {
        ans[idx++] = nums[dq.peekFirst()];
      }
    }
    return ans;
  }
}
