class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] freq = new int[26];

        // Store frequency of s1
        for (char ch : s1.toCharArray()) {
            freq[ch - 'a']++;
        }

        int left = 0;
        int right = 0;
        int needed = s1.length();

        while (right < s2.length()) {

            char ch = s2.charAt(right);

            // If character is needed
            if (freq[ch - 'a'] > 0) {
                needed--;
            }

            // Reduce frequency
            freq[ch - 'a']--;

            right++;

            // Found valid permutation
            if (needed == 0) {
                return true;
            }

            // Maintain window size
            if (right - left == s1.length()) {

                char leftChar = s2.charAt(left);

                // Restore frequency
                if (freq[leftChar - 'a'] >= 0) {
                    needed++;
                }

                freq[leftChar - 'a']++;

                left++;
            }
        }

        return false;
    }
}
