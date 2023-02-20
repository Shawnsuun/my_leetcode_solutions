class Solution {
    public int[] constructArr(int[] a) {
        int n = a.length;
        if (n == 0) return new int[0];
        int[] left = new int[n];
        int[] right = new int[n];
        int[] res = new int[n];

        left[0] = 1;
        for (int i = 1; i < n; i ++) {
            left[i] = left[i - 1] * a[i - 1];
        }

        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; i --) {
            right[i] = right[i + 1] * a[i + 1];
        } 

        for (int i = 0; i < n; i ++) {
            res[i] = left[i] * right[i];
        }       
        return res;
    }
}