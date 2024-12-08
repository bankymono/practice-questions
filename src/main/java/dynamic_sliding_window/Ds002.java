package dynamic_sliding_window;

import java.util.HashMap;
import java.util.Map;

public class Ds002 {
    public static void main(String[] args) {
        String s = "a";
        String t = "a";
        System.out.println(String.format("the min substring -> %s", minWindow(s,t)));
    }

    public static String minWindow(String s, String t){
        Map<Character, Integer> targetCount = new HashMap<>();
        Map<Character, Integer> windowCount = new HashMap<>();

        for(Character c : t.toCharArray()){
            targetCount.put(c, targetCount.getOrDefault(c,0) + 1);
        }

        int left = 0;
        int right = 0;
        int minLen = Integer.MAX_VALUE;
        int minStart = 0;
        int required = targetCount.size();
        int formed = 0;


        while(right < s.length()){
            Character currentChar = s.charAt(right);

            windowCount.put(currentChar, windowCount.getOrDefault(currentChar,0) + 1);

            if(targetCount.containsKey(currentChar)
            && targetCount.get(currentChar).intValue() == windowCount.get(currentChar).intValue()){
                formed++;
            }



            while(formed == required) {
                if(right - left + 1 < minLen){
                    minLen = right - left + 1;
                    minStart = left;
                }
                Character leftChar = s.charAt(left);
                
                windowCount.put(leftChar, windowCount.get(leftChar) - 1);

                if(targetCount.containsKey(leftChar)
                 && windowCount.get(leftChar).intValue() < targetCount.get(leftChar).intValue()){
                    --formed;
                 }

                ++left;
            }

            right++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}
