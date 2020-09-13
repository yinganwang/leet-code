class Solution {
    public int lengthOfLongestSubstring(String s) {
        // optimized sliding window, O(n)
        if (s == null || s.length() == 0) return 0;
        int n = s.length();
        Map<Character, Integer> charMap = new HashMap<>();
        int maxLength = 0;
        for (int i = 0, j = 0; j < n; j++) {
            if (charMap.containsKey(s.charAt(j))) {
                i = Math.max(charMap.get(s.charAt(j)), i);
            }
            maxLength = Math.max(maxLength, j - i + 1);
            charMap.put(s.charAt(j), j + 1);
        }

        // Sliding Window, O(n^2)
        // if (s == null || s.length() == 0) return 0;
        // int n = s.length();
        // Set<Character> charSet = new HashSet<>();
        // int startIdx = 0, endIdx = 0;
        // int maxLength = 1;
        
        // while (startIdx < n && endIdx < n) {
        //     if (!charSet.contains(s.charAt(endIdx))) {
        //         charSet.add(s.charAt(endIdx++));
        //         maxLength = Math.max(maxLength,charSet.size());
        //     } else {
        //         charSet.remove(s.charAt(startIdx++));
        //     }
        // }
        
        // brute force, O(n^3)
        // for (int i = 0; i < n - 1; i++) {
        //     startIdx = i;
        //     charSet.add(s.charAt(startIdx));
        //     endIdx = i + 1;
        //     while (endIdx < n && !charSet.contains(s.charAt(endIdx))) {
        //         charSet.add(s.charAt(endIdx));
        //         endIdx++;
        //     }
        //     if (charSet.size() > maxLength) {
        //         maxLength = charSet.size();
        //         charSet.clear();
        //         continue;
        //     } else {
        //         charSet.clear();
        //         continue;
        //     }
        // }

        return maxLength;
    }
}