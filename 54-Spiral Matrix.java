class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List res = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return res;
        int m = matrix.length, n = matrix[0].length;
        int left = 0, right = n - 1, up = 0, down = m - 1;
        while (res.size() < m * n) {
            for (int j = left; j <= right; j++) res.add(matrix[up][j]);
            for (int i = up + 1; i < down; i++) res.add(matrix[i][right]);
            for (int j = right; j >= left && res.size() < m * n; j--) res.add(matrix[down][j]);
            for (int i = down - 1; i > up && res.size() < m * n; i--) res.add(matrix[i][left]);
            left++;
            right--;
            up++;
            down--;
        }
        return res;
    }
}
