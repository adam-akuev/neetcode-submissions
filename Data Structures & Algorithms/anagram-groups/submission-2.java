class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();

        for (String str : strs) {
            int[] chars = new int[26];
            for (int ch : str.toCharArray()) {
                chars[ch - 'a']++;
            }
            String key = Arrays.toString(chars);
            anagrams.putIfAbsent(key, new ArrayList<>());
            anagrams.get(key).add(str);
        }

        return new ArrayList<>(anagrams.values());
    }
}
