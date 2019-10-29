package com.nix;

public class LongestSubstringWithoutRepeatingCharacters {
    public static String s = "pwwkew";
    public int lengthOfLongestSubstring(String s) {
        if (s.equals("") || null == s) {
            return 0;
        }
        int cur = 1;
        int max = 1;
        int unreset = 0;
        for (int index = 1; index < s.length(); index++) {
            unreset = 1;
            for (int i = index - cur; i < index; i++) {
                if (s.charAt(i) == s.charAt(index)) {
                    max = (max > cur) ? max : cur;
                    cur = index - i;
                    unreset = 0;
                }
            }
            cur += unreset;
        }
        max = (max > cur) ? max : cur;
        System.out.println(max);
        return max;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
        longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);

    }
}

