package org.example;

import java.util.ArrayList;
import java.util.List;

public class ArrayProblems2 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 6, -1, 4, 1, 8, 2};
        int k = 5;
        System.out.println(String.format("Array of averrage arrays -> %s", averageOfArrays(nums,k)));
    }

    public static List<Double> averageOfArrays(int[] nums, int k) {
        List<Double> arrAvs = new ArrayList<>();
        double sum = 0;
        double avg;

        for(int i = 0; i < k; ++i){
            sum += nums[i];
        }
        avg = sum/k;
        arrAvs.add(avg);


        for(int i = k; i < nums.length; ++i){
            sum += nums[i] - nums[i - k];
            avg = sum/k;
            arrAvs.add(avg);
        }

        return arrAvs;
    }

}
