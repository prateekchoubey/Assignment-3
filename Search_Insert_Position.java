class Solution {
    public int searchInsert(int[] nums, int target) {
        int ans = mid(nums, target, 0, nums.length - 1);
        return ans;
    }

    public int mid(int arr[], int target, int start, int end) {
        if (start > end) {
            return start;
        }

        int mid = start + (end - start) / 2;   //prevent integer overflow issue

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return mid(arr, target, mid + 1, end);
        } else {
            return mid(arr, target, start, mid - 1);
        }
    }
}
