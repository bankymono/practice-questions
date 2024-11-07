package org.example;

import java.util.Arrays;

public class ArrayProblems8 {
    public static void main(String[] args) {
        int[] nums = {2, 1, 3, 4, 5, 1, 2, 3, 6};
        int k = 3;
        int target = 8;

        System.out.println(String.format("arr input -> %s. target -> %s. count eq target -> %s", Arrays.toString(nums), target, countEqTarget(nums, k, target)));
        
    }

    public static int countEqTarget(int[] nums, int k, int target){
        int count = 0;
        int sum = 0;

        for(int i = 0; i < k; ++i){
            sum += nums[i];
        }

        if(sum == target){
            ++count;
        }

        for(int i = k; i < nums.length; ++i){
            sum += nums[i] - nums[i - k];

            if(sum == target){
                count++;
            }
        }


        return count;
    }
}
