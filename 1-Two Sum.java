class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        // for (int i = 0; i < nums.length; i++) {
        //     map.put(nums[i], i);
        // }
        
        int secondNum = 0;
        for (int i = 0; i < nums.length; i++) {
            secondNum = target - nums[i];
            if (map.containsKey(secondNum) && map.get(secondNum) != i) {
                return new int[] {i, map.get(secondNum)};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}