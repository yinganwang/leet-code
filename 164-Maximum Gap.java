class Solution {
    public int maximumGap(int[] nums) {
        if (nums == null || nums.length < 2) return 0;
        Arrays.sort(nums);
        int ans = 0;
        for (int i = 0, j = 1; i < nums.length - 1; i++) {
            ans = Math.max(ans, nums[j] - nums[i]);
            j++;
        }
        return ans;
    }
}