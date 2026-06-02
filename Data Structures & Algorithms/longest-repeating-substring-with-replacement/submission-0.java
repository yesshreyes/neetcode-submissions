class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int answer = 0;

        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];
            int maxFreq = 0;

            for (int j = i; j < n; j++) {
                char c = s.charAt(j);
                freq[c - 'A']++;
                maxFreq = Math.max(maxFreq, freq[c - 'A']);

                int len = j - i + 1;
                int changesNeeded = len - maxFreq;

                if (changesNeeded <= k) {
                    answer = Math.max(answer, len);
                }
            }
        }
        return answer;
    }
}
