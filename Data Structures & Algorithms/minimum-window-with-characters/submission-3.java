class Solution {
    public String minWindow(String s, String t) {
        if (t.isEmpty()) {
            return "";
        } 

        Map<Character, Integer> countS = new HashMap<>();
        Map<Character, Integer> countT = new HashMap<>();

        for (char c : t.toCharArray()) {
            countT.put(c, countT.getOrDefault(c, 0) + 1);
        }

        int minLength = Integer.MAX_VALUE;
        int[] result = {-1, -1};
        int have = 0;
        int need = countT.size();

        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            countS.put(c, countS.getOrDefault(c, 0) + 1);

            if (countT.containsKey(c) && countT.get(c).equals(countS.get(c))) {
                have++;
            }

            while (have == need) {
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    result[0] = left;
                    result[1] = right;
                }

                char leftC = s.charAt(left);
                countS.put(leftC, countS.get(leftC) - 1);
                if (countT.containsKey(leftC) && countS.get(leftC) < countT.get(leftC)) {
                    have--;
                }
                left++;
            }
        }
        return minLength == Integer.MAX_VALUE ? "" : s.substring(result[0], result[1] + 1);
    }
}
