package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Deque;
import java.util.List;

public class ArrayProblems5 {
    public static void main(String[] args) {
        int[] nums = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        System.out.println(String.format("the array of negative integers - %s", firstNegativeInt(nums,k)));
        
    }

    public static List<Integer> firstNegativeInt(int[] nums, int k){
        List<Integer> result = new ArrayList<>();
        Deque<Integer> negQueue = new LinkedList<>();

        for(int i = 0; i < nums.length; ++i){

            if(nums[i]< 0){
                negQueue.offerLast(i);
            }



        

            if(i >= k - 1) {
                if(!negQueue.isEmpty() && negQueue.peekFirst() < i - k + 1) {
                    negQueue.pollFirst();
                }

                if(negQueue.isEmpty()){
                    result.add(0);
                }else {
                    result.add(nums[negQueue.peekFirst()]);
                }
            }
        }

        return result;
    }
}
