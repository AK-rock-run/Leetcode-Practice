import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // Set<Integer> set1 = new HashSet<>();
        // Set<Integer> resultSet = new HashSet<>();

        // // Add all elements of nums1
        // for (int num : nums1) {
        //     set1.add(num);
        // }

        // // Check intersection
        // for (int num : nums2) {
        //     if (set1.contains(num)) {
        //         resultSet.add(num);
        //     }
        // }

        // // Convert set to array
        // int[] result = new int[resultSet.size()];
        // int i = 0;
        // for (int num : resultSet) {
        //     result[i++] = num;
        // }

        // return result;
         Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0;
        Set<Integer> resultSet = new HashSet<>();

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                resultSet.add(nums1[i]);
                i++;
                j++;
            } 
            else if (nums1[i] < nums2[j]) {
                i++;
            } 
            else {
                j++;
            }
        }

        // Convert set to array
        int[] result = new int[resultSet.size()];
        int k = 0;
        for (int num : resultSet) {
            result[k++] = num;
        }

        return result;



    }
}