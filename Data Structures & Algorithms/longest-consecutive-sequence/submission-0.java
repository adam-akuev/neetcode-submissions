class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        int res = 0;

        for (int num : nums) {
            if (!count.containsKey(num)) {
                int leftSize = count.getOrDefault(num - 1, 0);
                int rightSize = count.getOrDefault(num + 1, 0);
                int totalSize = leftSize + rightSize + 1;

                count.put(num, totalSize);

                count.put(num - leftSize, totalSize);
                count.put(num + rightSize, totalSize);

                res = Math.max(res, totalSize);
            }
        }
        return res;
    }
}
