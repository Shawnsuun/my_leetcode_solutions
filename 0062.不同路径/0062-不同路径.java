class Solution {
    public int uniquePaths(int m, int n) {
        //dp function : f(i, j) = f(i - 1, j) + f(i, j - 1)
        int[][] dp = new int[m][n];
        //i = 0, f(i, j) = 1
        Arrays.fill(dp[0], 1);
        //j = 0, f(i, j) = 1
        for (int i = 1; i < m; i ++) {
            dp[i][0] = 1;
        }
        
        for (int i = 1; i < m; i ++) {
            for (int j = 1; j < n; j ++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }
}