package com.nix;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    public void lengthOfLongestSubstring() {
        LongestSubstringWithoutRepeatingCharacters longestCharacters = new LongestSubstringWithoutRepeatingCharacters();
        String string = "abcabcbb";
        int actual = longestCharacters.lengthOfLongestSubstring(string);
        int expected = 3;
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void lengthOfLongestSubstringNull() {
        LongestSubstringWithoutRepeatingCharacters longestCharacters = new LongestSubstringWithoutRepeatingCharacters();
        String string = "";
        int actual = longestCharacters.lengthOfLongestSubstring(string);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void lengthOfLongestSubstringNullOneLetter() {
        LongestSubstringWithoutRepeatingCharacters longestCharacters = new LongestSubstringWithoutRepeatingCharacters();
        String string = "aaaaaaaa";
        int actual = longestCharacters.lengthOfLongestSubstring(string);
        int expected = 1;
        Assert.assertEquals(actual, expected);
    }
}