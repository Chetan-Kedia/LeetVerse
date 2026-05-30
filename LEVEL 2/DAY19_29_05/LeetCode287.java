class Solution {
    public int findDuplicate(int[] nums) {

        // Phase 1: find intersection point inside the cycle
        int slow = nums[0];
        int fast = nums[nums[0]];
        while (slow != fast) {
            slow = nums[slow];          // 1 hop
            fast = nums[nums[fast]];    // 2 hops
        }

        // Phase 2: find cycle entry = duplicate
        slow = 0;                       // reset slow to start (index 0, NOT nums[0])
        while (slow != fast) {
            slow = nums[slow];          // both move 1 hop
            fast = nums[fast];
        }

        return slow;                    // entry point of cycle = duplicate
    }
