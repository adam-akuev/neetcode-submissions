class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> result = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num1 = nums[i];
            int num2 = target - num1;

            if (result.containsKey(num2)) {
                return new int[] { result.get(num2), i };
            }

            result.put(num1, i);
        }

        return new int[] {};
    }
}
