class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] s1Count = new int[26];
        int[] windowCount = new int[26];

        // Step 1: Count characters in s1
        for (int i = 0; i < s1.length(); i++) {
            s1Count[s1.charAt(i) - 'a']++;
            windowCount[s2.charAt(i) - 'a']++;
        }

        // Step 2: Check initial window
        if (matches(s1Count, windowCount)) return true;

        // Step 3: Slide the window
        for (int i = s1.length(); i < s2.length(); i++) {
            // Add right character
            windowCount[s2.charAt(i) - 'a']++;
            // Remove left character
            windowCount[s2.charAt(i - s1.length()) - 'a']--;

            if (matches(s1Count, windowCount)) return true;
        }

        return false;
    }

    private boolean matches(int[] s1Count, int[] windowCount) {
        for (int i = 0; i < 26; i++) {
            if (s1Count[i] != windowCount[i]) return false;
        }
        return true;
    }
}
