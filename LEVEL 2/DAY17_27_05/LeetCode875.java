class Solution {

    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;

        // Find maximum pile to set upper bound
        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        int res = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (canEatAll(piles, mid, h)) {
                res = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return res;
    }
}
