package dynamic_sliding_window;

public class Ds003 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 11;

        System.out.println(String.format("longest sub array -> %d", longestSubarrayWithSumAtMostK(nums, k)));        
    }


    public static int longestSubarrayWithSumAtMostK(int[] nums, int k) {
        int longestLength = 0;
        int left = 0;
        int currentSum = 0;

        for(int right = 0; right < nums.length; ++right){
            currentSum += nums[right];

            while(currentSum > k && left <= right){
                currentSum -= nums[left];
                left++;
            }

            longestLength = Math.max(longestLength, right - left + 1);
        }


        return longestLength;
    }
}
