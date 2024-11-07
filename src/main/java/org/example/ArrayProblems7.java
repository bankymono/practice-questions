package org.example;

import java.util.Arrays;

public class ArrayProblems7 {
    public static void main(String[] args) {
         int[] nums = {4, 2, 1, 7, 8, 1, 2, 8, 10};
         int k = 3; 
         int target = 15;

        System.out.println(String.format("array -> %s, target -> %s, min-sum -> %s", Arrays.toString(nums), target, minSumEqTarget(nums,k,target)));

    }


    public static int minSumEqTarget(int[] nums, int k, int target){
        int minSum = Integer.MAX_VALUE;
        int sum = 0;

        for( int i = 0; i < k; ++i){
            sum += nums[i];
        }

        if(sum >= target){
            minSum = Math.min(sum,minSum);
        }

        for(int i = k; i < nums.length; ++i){
            sum += nums[i] - nums[i - k];

            if(sum >= target){
                minSum = Math.min(sum,minSum);
            }
        }

        if(minSum == Integer.MAX_VALUE){
            minSum = -1;
        }


        return minSum;
    }
}
