class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] s1Count = new int[26];
        int[] window = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            s1Count[s1.charAt(i) - 'a']++;
            window[s2.charAt(i) - 'a']++;
        }

        if (matches(s1Count, window)) return true;

        for (int i = s1.length(); i < s2.length(); i++) {
            window[s2.charAt(i) - 'a']++; // add new char
            window[s2.charAt(i - s1.length()) - 'a']--; // remove old char

            if (matches(s1Count, window)) return true;
        }

        return false;
    }

    private boolean matches(int[] a, int[] b) {
        for (int i = 0; i < 26; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
}