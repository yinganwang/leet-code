class Solution {
    public int tribonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 1;
        int[] val = new int[n + 1];
        val[0]  = 0;
        val[1] = 1;
        val[2] = 1;
        for (int i = 3; i < n + 1; i++) {
            val[i] = val[i - 3] + val[i - 2] + val[i - 1];
        }
        return val[n];
    }
}
