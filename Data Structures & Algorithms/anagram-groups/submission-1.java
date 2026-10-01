class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();

        for (String str : strs) {
            char[] chars = new char[26];
            for (char ch : str.toCharArray()) {
                chars[ch - 'a']++;
            }
            String key = Arrays.toString(chars);
            anagrams.putIfAbsent(key, new ArrayList<>());
            anagrams.get(key).add(str);
        }

        return new ArrayList<>(anagrams.values());
    }
}
