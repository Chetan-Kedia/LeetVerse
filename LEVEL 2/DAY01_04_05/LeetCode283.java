public void moveZeroes(int[] nums) {
    int lastNonZeroFoundAt = 0;

    // Pass 1: write non-zeros to front
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] != 0) {
            nums[lastNonZeroFoundAt++] = nums[i];
        }
    }

    // Pass 2: fill tail with zeros
    for (int i = lastNonZeroFoundAt; i < nums.length; i++) {
        nums[i] = 0;
    }
}
