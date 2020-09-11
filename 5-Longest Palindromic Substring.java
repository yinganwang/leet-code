class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return s;
        int n = s.length();
        int maxLength = 1;
        int startIdx = 0;
        boolean [][] dp = new boolean [n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
        }
        for (int i = 0; i < n; i++) {
            if (i < n - 1) {
                if (s.charAt(i) == s.charAt(i + 1) && maxLength == 1) {
                    maxLength = 2;
                    startIdx = i;
                }
                dp[i][i+1] = (s.charAt(i) == s.charAt(i + 1));
            }
        }
        
        for (int k = 3; k <= n;  k++) {
            for (int i = 0; i <= n - k; i++) {
                int j = i + k - 1;
                if (dp[i+1][j-1] && s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = true;
                    
                    if (k > maxLength) {
                        maxLength = k;
                        startIdx = i;
                    }
                }
            }
        }
        return s.substring(startIdx, startIdx + maxLength);
    }
}