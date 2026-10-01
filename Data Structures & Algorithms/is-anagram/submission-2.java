class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> charsS = new HashMap<>();
        Map<Character, Integer> charsT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            charsS.put(s.charAt(i), charsS.getOrDefault(s.charAt(i), 0) + 1);
            charsT.put(t.charAt(i), charsT.getOrDefault(t.charAt(i), 0) + 1);
        }

        return charsS.equals(charsT);
    }
}
