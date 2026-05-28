class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;

        // If array is already sorted
        if (nums[left] <= nums[right]) {
            return nums[left];
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Minimum is in right half
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } 
            // Minimum is in left half (including mid)
            else {
                right = mid;
            }
        }

        return nums[left];
    }
}
