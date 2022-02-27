package com.kapcb.ccc.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * <a>Title: LongestSubString </a>
 * <a>Author: Kapcb <a>
 * <a>Description: LongestSubString <a>
 *
 * @author Kapcb
 * @version 1.0
 * @date 2022/2/27 17:28
 * @since 1.0
 */
public class LongestSubString {

    private LongestSubString() {
    }

    private static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() < 2) {
            return 0;
        }
        Map<Character, Integer> characters = new HashMap<>(2 << 1);
        int n = s.length();
        int left = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (characters.containsKey(s.charAt(i))) {
                left = Math.max(characters.get(s.charAt(i)) + 1, left);
            }
            characters.put(s.charAt(i), i);
            max = Math.max(max, i - left + 1);
        }
        return max;
    }

    public static void main(String[] args) {

    }

}
