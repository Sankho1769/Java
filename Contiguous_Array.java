// Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.

// Example 1:

// Input: nums = [0,1]
// Output: 2
// Explanation: [0, 1] is the longest contiguous subarray with an equal number of 0 and 1.

import java.util.HashMap;

public class Contiguous_Array {

    public static int findMaxLength(int[] nums) {

        int sum = 0;
        int maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();


        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1)
                sum += 1;
            else
                sum -= 1;

            if (map.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 1, 1, 0, 0};

        int result = findMaxLength(nums);
        System.out.println("Maximum length of contiguous subarray: " + result);
    }
}
