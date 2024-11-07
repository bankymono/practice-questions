package org.example;

import java.util.Arrays;

public class ArrayProblems9 {
    public static void main(String[] args) {
        int[] nums = {1, 5, 2, 3, 7, 1, 9};
        int k = 3;

        System.out.println(String.format("arrays -> %s, maxProd -> %s", Arrays.toString(nums), maxProductSubArray(nums, k)));
        
    }

    public static double maxProductSubArray(int[] nums, int k) {
        double prod = 1;
        
        double maxProd = Double.NEGATIVE_INFINITY;

        for(int i = 0; i < k; ++i){
            prod *= nums[i];
        }

        maxProd = prod;


        for(int i = k; i < nums.length; ++i){

            if(nums[i -k] != 0){
                prod /= nums[i-k];
                prod *= nums [i];
            } else {
                prod = 1;

                for(int j = i - k + 1; j <= i; ++j) {
                    prod *= nums[j];
                }
            }
            maxProd = Math.max(maxProd, prod);
        }

        return maxProd;
    }
}
