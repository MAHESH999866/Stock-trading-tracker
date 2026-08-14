class Solution {
    public int maximumLengthSubstring(String s) {
        int[] count = new int[26];
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            // Add the current character to our frequency map
            char rightChar = s.charAt(right);
            count[rightChar - 'a']++;

            // If any character frequency exceeds 2, shrink the window from the left
            while (count[rightChar - 'a'] > 2) {
                char leftChar = s.charAt(left);
                count[leftChar - 'a']--;
                left++;
            }

            // Update the maximum length of a valid window
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}