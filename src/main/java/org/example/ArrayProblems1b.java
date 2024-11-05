package org.example;

import java.util.Arrays;

public class ArrayProblems1b {
    public static void main(String[] args) {
        int [] nums = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k = 4;

        System.out.println(String.format("The max sum of a sub array %s is %d", Arrays.toString(nums), maxSumSubArr(nums, k)));

    }

    public static int maxSumSubArr(int[] nums, int k) {
        int maxSum = Integer.MIN_VALUE;

        int sum = 0;

        for(int i = 0; i < k; ++i) {
            sum += nums[i];
        }

        maxSum = Math.max(sum, maxSum);

        for(int i = k; i < nums.length; ++i) {
            sum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
    
}
