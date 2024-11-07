package org.example;

import java.util.*;

public class ArrayProblems10 {
    public static void main(String[] args) {
        int [] nums = {1, 2, 4, 7, 8, 6, 3, 4, 10};
        int k = 3;

        System.out.println(String.format("arrays -> %s, output -> %s", Arrays.toString(nums), mostEvenSubArr(nums, k)));
        
    }

    public static List<Integer> mostEvenSubArr(int[] nums, int k){
        List<Integer> result = new ArrayList<>();
        int maxCount = Integer.MIN_VALUE;
        Deque<Integer> arrHolder = new LinkedList<>();

        int count = 0;

        for(int i = 0; i < k; ++i){
            arrHolder.addLast(nums[i]);
            if(nums[i] % 2 == 0){
                ++count;
            }
        }

        if(!arrHolder.isEmpty()){
            result = arrHolder.stream().toList();
            maxCount = count;
        }

        for(int i = k; i < nums.length; ++i){
            arrHolder.pollFirst();
            arrHolder.addLast(nums[i]);
            if(nums[i-k] % 2 == 0){
                --count;
            }
            if(nums[i] % 2== 0){
                ++count;
            }

            if(count >= maxCount){
                result = arrHolder.stream().toList();
                maxCount = count;
            }
        }


        return result;
    }
}
