public int[] productExceptSelf(int[] nums) {
    int n = nums.length;
    int[] answer = new int[n];

    // ── Pass 1: fill answer[i] with left prefix product ──
    answer[0] = 1;          // nothing to the left of index 0
    for (int i = 1; i < n; i++) {
        answer[i] = answer[i - 1] * nums[i - 1];
    }

    // ── Pass 2: multiply answer[i] by right suffix product ──
    int suffix = 1;         // running product from the right
    for (int i = n - 1; i >= 0; i--) {
        answer[i] *= suffix;    // left prefix  x  right suffix
        suffix    *= nums[i];
    }

    return answer;
}
