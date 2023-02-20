class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[right]) {
                right = mid;    //mid could possible be the answer index, cannot skip to mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return nums[left];
    }
}