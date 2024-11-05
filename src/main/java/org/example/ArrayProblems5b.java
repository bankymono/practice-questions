package org.example;

import java.util.*;

public class ArrayProblems5b {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;

        System.out.println(String.format("array -> %s, output array -> %s", Arrays.toString(nums), distinctArr(nums, k)));
    }


    public static List<Integer> distinctArr(int[] nums, int k){
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> arrElementCount = new HashMap<>();
        for(int i = 0; i < k; ++i){
            arrElementCount.put(nums[i],arrElementCount.getOrDefault(nums[i],0) + 1);
        }

        result.add(arrElementCount.size());


        for(int i = k; i < nums.length; ++i){
            arrElementCount.put(nums[i], arrElementCount.getOrDefault(nums[i],0) + 1);


                if(arrElementCount.containsKey(nums[i-k])){
                    arrElementCount.put(nums[i - k], arrElementCount.get(nums[i - k]) - 1);

                    if(arrElementCount.get(nums[i - k]) == 0){
                        arrElementCount.remove(nums[i - k]);
                    }
                }
                result.add(arrElementCount.size());
            
        }

        System.out.println(arrElementCount.toString());

       return result;

    }


}
