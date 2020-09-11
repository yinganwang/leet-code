class Solution {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) return true;
        int startIdx = 0, endIdx = s.length() - 1;
        while (startIdx < endIdx) {
            if (!isLetterOrDigit(s.charAt(startIdx))) {
                startIdx++;
                continue;
            }
            if (!isLetterOrDigit(s.charAt(endIdx))) {
                endIdx--;
                continue;
            }
            if (Character.toLowerCase(s.charAt(startIdx)) != Character.toLowerCase(s.charAt(endIdx))) return false;
            startIdx++;
            endIdx--;
        }
        return true;
    }
    
    
    private static boolean isLetterOrDigit(char c) {
        return (c >= 'a' && c <= 'z') ||
               (c >= 'A' && c <= 'Z') ||
               (c >= '0' && c <= '9');
    }
}