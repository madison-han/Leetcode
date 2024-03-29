class Solution {
    public int longestPalindrome(String s) {
        int len = s.length();
        if (len <= 1) return len;

        Map<Character, Integer> pairs = new HashMap<>();
        int ans = 0;
        int temp = 0;
        char c;

        for (int i = 0; i < len; i++) {
            c = s.charAt(i);
            if (!pairs.containsKey(c) || pairs.get(c) == 0) {
                pairs.put(c, 1); // Add it to pairs, move on
            } else {
                ans += 2;
                pairs.put(c, 0); // The pair is gone
            }
            
        }

        return len > ans ? ans + 1 : ans;

    }
}