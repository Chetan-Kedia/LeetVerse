class Solution {

    public int missingNumber(int[] nums) {

        int n = nums.length;

        int res = n; // start with n (covers index n)

        for (int i = 0; i < n; i++) {
            res ^= i ^ nums[i]; // XOR index and value — pairs cancel
        }

        return res; // only missing number remains
    }
}
