package org.example;

import java.util.ArrayList;
import java.util.List;

public class ArrayProblems4 {
    public static void main(String[] args) {

    }

    public static List<Integer> negArrays(int[] nums, int k) {
        List<Integer> negArr = new ArrayList<>();
        int[] blockArr = new int[k];
        int neg = 0;

        for(int i = 0; i < k; ++i) {
            if(nums[i] < 0) {
                neg = nums[i];
                break;
            }
        }
        negArr.add(neg);


        for(int i = k; i < nums.length; ++i){

        }


        return negArr;
    }
}
