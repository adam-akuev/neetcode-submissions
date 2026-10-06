class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> chars = new HashSet<>();
        int max = 0;
        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            while (l < s.length() && chars.contains(s.charAt(r))) {
                chars.remove(s.charAt(l));
                l++;
            }
            chars.add(s.charAt(r));
            max = Math.max(max, r - l + 1);
        }
        return max;
    }
}
