package org.example;

import java.util.Arrays;

public class ArrayProblems11 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        
        int k = 3;


        System.out.println(String.format("arrays -> %s, prod -> %s", Arrays.toString(nums),maxProdSubArr(nums, k)));
    }

    public static long maxProdSubArr(int[] nums, int k){
        long maxProd = Long.MIN_VALUE;

        long prod = 1;

        for(int i = 0; i < k; ++i) {
            prod *= nums[i];
        }

        maxProd = Math.max(maxProd, prod);


        for(int i = k; i < nums.length; ++i) {
            if(nums[i - k] != 0) {
                prod /= nums[i - k];

                prod *= nums[i];
            } else {
                prod = 1;
                for(int j = i - k + 1; j <= i; ++j){
                    prod *= nums[j];
                }
            }

            maxProd = Math.max(prod, maxProd);
        }

        return maxProd;
    }
}
