class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, right = 0, n = nums.length;
        int sum = 0, len = Integer.MAX_VALUE; // no valid window yet

        while (right < n) {
            sum += nums[right]; // expand window right

            while (sum >= target) { // valid window found
                len = Math.min(len, right - left + 1); // record min
                sum -= nums[left]; // shrink window left
                left++;
            }

            right++; // advance right
        }

        return len == Integer.MAX_VALUE ? 0 : len; // 0 if none
    }
}
