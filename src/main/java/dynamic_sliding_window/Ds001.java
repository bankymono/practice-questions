package dynamic_sliding_window;

import java.util.HashSet;
import java.util.Set;

public class Ds001 {
    public static void main(String[] args) {
        String s = "abcabcbb";
       System.out.println(String.format("The subarray length is -> %s", lengthOfLongestSubstring(s)));
    }

   public static int lengthOfLongestSubstring(String s){
    Set<Character> chars = new HashSet<>();
    int maxLength = 0;
    int left = 0;

    for(int right = 0; right < s.length(); ++right) {

        Character currentChar = s.charAt(right);

        while(chars.contains(currentChar)){
            chars.remove(s.charAt(left));
            left++;
        }

        chars.add(currentChar);

        maxLength = Math.max(maxLength, chars.size());
        // maxLength = Math.max(maxLength, right - left + 1); 
    }

    return maxLength;
   }

}