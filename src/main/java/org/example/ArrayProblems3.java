package org.example;

public class ArrayProblems3 {
    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 1, 3, 2};
        int k = 3;

        System.out.println(String.format("min sum value -> %s",minSumArray(nums,k)));

    }

    public static int minSumArray(int[] nums, int k) {
        int sum = 0;
        int minSum;

        for(int i = 0; i < k; ++i){
            sum += nums[i];
        }
        minSum = sum;

        for(int i = k; i < nums.length; ++i){
            sum += nums[i] - nums[i - k];
            minSum = Math.min(minSum,sum);
        }

        return minSum;
    }
}
