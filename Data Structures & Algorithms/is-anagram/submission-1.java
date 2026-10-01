class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> countChar = new HashMap<>();

        for (char c : s.toCharArray()) {
            countChar.put(c, countChar.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            if (!countChar.containsKey(c)) {
                return false;
            }

            countChar.put(c, countChar.get(c) - 1);
            if (countChar.get(c) < 0) {
                return false;
            }
        }

        return true;
    }
}
