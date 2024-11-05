package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayProblems2b {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 6, -1, 4, 1, 8, 2};
        int k = 5;

        System.out.println(String.format("Arrays -> %s, avg arrays -> %s", Arrays.toString(nums), averageArray(nums,k)));

    }

    public static List<Double> averageArray(int[] nums, int k) {
        List<Double> avgArrays = new ArrayList<>();
        int sum = 0;
        double avg;

        for(int i = 0; i < k; ++i) {
            sum += nums[i];
        }

        avg = (double) sum/k;

        avgArrays.add(avg);


        for(int i = k; i < nums.length; ++i) {
            sum += nums[i] - nums[i - k];
            avg = (double) sum/k;
            avgArrays.add(avg);
        }

        return avgArrays;
    }
}
