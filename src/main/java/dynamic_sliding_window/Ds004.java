package dynamic_sliding_window;

import java.util.HashMap;
import java.util.Map;

public class Ds004 {
    public static void main(String[] args) {
        int [] nums = {1, 2, 1, 3, 4};
        int k = 3;
        System.out.println(String.format("number of distinct k arrays -> %s", subarrWithKInt(nums,k)));
    }


    public static int subarrWithKInt(int[] nums,int k) {
        return subArrWithMostK(nums, k) - subArrWithMostK(nums, k-1);

    }

    public static int subArrWithMostK(int[] nums, int k) {
        Map<Integer, Integer> eleTracker = new HashMap<>();
        int left = 0;
        int count = 0;

        for(int right = 0; right < nums.length; ++right){
            eleTracker.put(nums[right], eleTracker.getOrDefault(nums[right], 0) + 1);

            while(eleTracker.size() > k){
                eleTracker.put(nums[left], eleTracker.get(nums[left]) - 1);
                if(eleTracker.get(nums[left]) == 0){
                    eleTracker.remove(nums[left]);
                }
                left++;
            }

            count += right - left + 1;
        }

        return count;
    }
}
