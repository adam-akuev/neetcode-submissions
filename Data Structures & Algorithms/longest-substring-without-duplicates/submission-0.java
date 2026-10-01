class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> nonDuplicate = new HashSet<>();
        int left = 0;
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            while (nonDuplicate.contains(s.charAt(i))) {
                nonDuplicate.remove(s.charAt(left));
                left++;
            }
            nonDuplicate.add(s.charAt(i));
            result = Math.max(result, i - left + 1);
        }
        return result;
    }
}
