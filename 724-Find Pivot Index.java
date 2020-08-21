class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int sum = 0, leftsum = 0;
        for (int val : nums) sum += val;
        for (int i = 0; i < n; i++) {
            if (leftsum == sum - leftsum - nums[i]) return i;
            leftsum += nums[i];
        }
        return -1;
        // if (n == 0) return -1;
        // if (n == 1) return 0;
        // for (int i = 1; i < n; i++) {
        //     nums[i] += nums[i - 1];
        // }
        // if (nums[n - 1] - nums[0] == 0) return 0;
        // for (int i = 0; i < n - 1; i++) {
        //     if (nums[i] == nums[n - 1] - nums[i + 1]) {
        //         return i + 1;
        //     }
        // }
        // return -1;
    }
}
