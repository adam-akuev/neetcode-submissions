class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> count = new HashMap<>();
        int result = 0;
        int maxCount = 0;
        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            count.put(s.charAt(r), count.getOrDefault(s.charAt(r), 0) + 1);
            maxCount = Math.max(maxCount, count.get(s.charAt(r)));

            while ((r - l + 1) - maxCount > k) {
                count.put(s.charAt(l), count.get(s.charAt(l)) - 1);
                l++;
            }

            result = Math.max(result, r - l + 1);
        }
        return result;
    }
}
