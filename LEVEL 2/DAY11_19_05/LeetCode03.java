class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, count = 0;  // window start & best length
        Set<Character> set = new HashSet<>();  // chars in window
        char[] arr = s.toCharArray();
        for (int right = 0; right < arr.length; right++) {
            while (set.contains(arr[right])) {  // duplicate → shrink
                set.remove(arr[left]);
                left++;
            }
            set.add(arr[right]);  // char is unique — add to window
            count = Math.max(count, right - left + 1);  // update best
        }
    return count;
    }
}
