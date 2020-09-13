class Solution {
    public int maxArea(int[] height) {
        int ans = 0;
        int n = height.length;
        int i = 0, j = n - 1;
        
        
        while (i < j) {
            ans = Math.max(ans, (j - i) * Math.min(height[i], height[j]));
            if (height[i] < height[j]) i++;
            else j--;
            
        }
        return ans;
    }
}