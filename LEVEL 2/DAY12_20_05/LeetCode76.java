class Solution {
    public String minWindow(String s, String t) {
        if (s == null || t == null || s.length() < t.length()) return "";

        int[] tCounts = new int[128];
        for (char c : t.toCharArray()) tCounts[c]++;

        int required = 0;
        for (int count : tCounts)
            if (count > 0) required++;

        int[] windowCounts = new int[128];
        int left = 0, right = 0, formed = 0;

        int minLen = Integer.MAX_VALUE, startIdx = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            windowCounts[c]++;

            if (tCounts[c] > 0 && windowCounts[c] == tCounts[c]) formed++;

            while (left <= right && formed == required) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    startIdx = left;
                }

                windowCounts[s.charAt(left)]--;

                if (tCounts[s.charAt(left)] > 0 &&
                    windowCounts[s.charAt(left)] < tCounts[s.charAt(left)])
                    formed--;

                left++;
            }

            right++;
        }

        return minLen == Integer.MAX_VALUE ? "" :
               s.substring(startIdx, startIdx + minLen);
    }
}
