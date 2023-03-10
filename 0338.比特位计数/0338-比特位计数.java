class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            int j = i;
            while (j != 0) {
                ans[i] ++;
                j = j & (j - 1);
            }
        }
        return ans;
    }
}