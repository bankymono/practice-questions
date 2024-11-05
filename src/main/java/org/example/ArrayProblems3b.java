package org.example;

import java.util.Arrays;

public class ArrayProblems3b {
    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 1, 3, 2};
        int k = 3;

        System.out.println(String.format("The array -> %s, min sum -> %s", Arrays.toString(nums), minSumSubArr(nums, k)));

    }

    public static int minSumSubArr(int[] nums, int k) {
        int sum = 0;
        int minSum = Integer.MAX_VALUE;

        for(int i = 0; i < k; ++i){
            sum += nums[i];
        }

        minSum = Math.min(sum,minSum);

        for(int i = k; i < nums.length; ++i){
            sum += nums[i] - nums[i - k];
        }

        minSum = Math.min(sum, minSum);

        return minSum;
    }

    
}
