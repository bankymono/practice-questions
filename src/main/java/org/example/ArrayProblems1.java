package org.example;

import java.util.Arrays;
import java.util.List;

public class ArrayProblems1 {
    public static void main(String[] args) {

        int[] nums = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k = 4;
        System.out.println(String.format("max sum of any sub array in %s is -> %s", Arrays.toString(nums), maxSumInArray(nums, k)));
    }


    public static int maxSumInArray(int[] nums, int k) {
        int sum = 0;
        int maxSum = 0;

        for(int i = 0; i < k; ++i) {
            sum += nums[i];
        }

        maxSum = Math.max(maxSum,sum);

        for(int i = k; i < nums.length; ++i) {
            sum += nums[i] - nums[i - k];
            maxSum = Math.max(sum,maxSum);
        }


        return maxSum;
    }
}
