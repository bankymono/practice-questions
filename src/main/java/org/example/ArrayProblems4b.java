package org.example;

import java.util.*;

public class ArrayProblems4b {
    public static void main(String[] args) {
        int[] nums = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;

        System.out.println(String.format("array -> %s, arr of neg -> %s", Arrays.toString(nums),firstNegativeInt(nums, k)));
    }

    public static List<Integer> firstNegativeInt(int[] nums, int k) {
        List<Integer> negArrays = new ArrayList<>();
        Deque<Integer> trackNegIndex = new LinkedList<>();


        for(int i = 0; i < nums.length; ++i) {
            

            if(nums[i] < 0){
                trackNegIndex.addLast(i);
            }

            if(i >= k - 1) {
                if(!trackNegIndex.isEmpty() && trackNegIndex.peekFirst() < i - k + 1){
                    trackNegIndex.pollFirst();
                }
                
                if(trackNegIndex.isEmpty()){
                    negArrays.add(0);
                } else {
                    negArrays.add(nums[trackNegIndex.peekFirst()]);
                }
            }
        }

        return negArrays;
    }
}
