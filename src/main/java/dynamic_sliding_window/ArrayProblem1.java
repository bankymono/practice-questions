package dynamic_sliding_window;

import java.util.Arrays;

public class ArrayProblem1 {
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;

        System.out.println(String.format("arrays -> %s, smallest sum -> %s", Arrays.toString(nums), smallestSubArr(nums, target)));

    }

    public static int smallestSubArr(int[] nums, int target) {
        int minLength = Integer.MAX_VALUE;
        int start = 0;
        int sum = 0;
        int result = 0;


        for(int end = 0; end < nums.length; ++end){
            sum += nums[end];


            while(sum >= target) {
                minLength = Math.min(minLength, end - start + 1);
                result = end - start + 1;
                sum -= nums[start];
                start++;
            }
        }

        return result;

    }
}
