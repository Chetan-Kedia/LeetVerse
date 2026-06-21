import java.util.*;

class Solution {
    public String reorganizeString(String s) {
        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        int maxFreq = 0;
        for (int count : freq) {
            maxFreq = Math.max(maxFreq, count);
        }

        if (maxFreq > (s.length() + 1) / 2) {
            return "";
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> b[1] - a[1]
        );

        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                pq.offer(new int[]{i, freq[i]});
            }
        }

        StringBuilder answer = new StringBuilder();
        int[] prev = null;

        while (!pq.isEmpty()) {
            int[] current = pq.poll();

            answer.append((char)(current[0] + 'a'));
            current[1]--;

            if (prev != null && prev[1] > 0) {
                pq.offer(prev);
            }

            prev = current;
        }

        return answer.toString();
    }
}
