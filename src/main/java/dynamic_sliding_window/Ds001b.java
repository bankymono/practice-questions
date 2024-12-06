package dynamic_sliding_window;

import java.util.HashMap;
import java.util.Map;

public class Ds001b {
    public static void main(String[] args) {
        String  s = "abcabcbb";

        System.out.println(String.format("the longest substring -> %s",lengthOfLongestSubstring(s)));
    }

    public static int lengthOfLongestSubstring(String s){
        Map<Character, Integer> chars = new HashMap<>();
        int left = 0;
        int maxLength = 0;


        for(int right = 0; right < s.length(); ++right){
            Character currentChar = s.charAt(right);

            if(chars.containsKey(currentChar)){
                left = Math.max(left,chars.get(currentChar) + 1);
            }


            chars.put(currentChar, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
