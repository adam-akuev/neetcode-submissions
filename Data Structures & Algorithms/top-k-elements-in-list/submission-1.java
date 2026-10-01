class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        List<Integer>[] maxCount = new List[nums.length + 1];

        for (int i = 0; i < maxCount.length; i++) {
            maxCount[i] = new ArrayList<>(); 
        }

        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            maxCount[entry.getValue()].add(entry.getKey());
        }

        int[] result = new int[k];
        int index = 0;
        for (int i = maxCount.length - 1; i > 0 && index < k; i--) {
            for (int max : maxCount[i]) {
                result[index++] = max;
                if (index == k) {
                    return result;
                }  
            }
        }
        return result;
    }
}
