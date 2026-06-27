class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i = 0;
        int j = k - 1;
        int sum = 0;

        for (int l = 0; l <= j; l++) {
            sum += nums[l];
        }

        double max = (double) sum / k;

        while (j < nums.length - 1) {   // <-- fix here
            j++;
            sum = sum - nums[i] + nums[j];
            i++;

            double avg = (double) sum / k;
            max = Math.max(max, avg);
        }

        return max;
    }
}