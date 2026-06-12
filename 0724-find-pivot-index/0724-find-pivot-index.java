class Solution {
    public int pivotIndex(int[] nums) {
        int[] arr1 = new int[nums.length];
        int[] arr2 = new int[nums.length];
        for (int i = 1; i < nums.length; i++) {
            arr1[i] = arr1[i - 1] + nums[i - 1];
        }
        int right = 0;
        for (int j = nums.length - 1; j >= 0; j--) {
            arr2[j] = right;
            right += nums[j];
        }
        for (int i = 0; i < nums.length; i++) {
            if (arr1[i] == arr2[i])
                return i;
        }
        return -1;
    }
}