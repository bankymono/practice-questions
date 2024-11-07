package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayProblems6 {
    public static void main(String[] args) {
        int [] nums = {1, 3, 2, 8, 5, 7};
        int k = 3;
        System.out.println(String.format("array -> %s, max sum -> %s", Arrays.toString(nums), maxSumConsArray(nums, k)));

    }

    public static int maxSumConsArray(int[] nums, int k){
        int max = Integer.MIN_VALUE;
        int sum = 0;

        List<Integer> sumArrs = new ArrayList<>();

        for(int i = 0; i < k; ++i){
            sum += nums[i];
        }

        sumArrs.add(sum);

        for(int i = k; i < nums.length; ++i) {
            sum += nums[i] - nums[i -k];
            sumArrs.add(sum);
        }


        for(int i = 0; i < sumArrs.size() - 1; ++i){
            max = Math.max(Math.abs(sumArrs.get(i) - sumArrs.get(i + 1)), max);
        }


        return max;

    }

}
