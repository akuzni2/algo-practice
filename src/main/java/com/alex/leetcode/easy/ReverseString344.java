package com.alex.leetcode.easy;

public class ReverseString344 {

    public void reverseString(char[] s) {
        // 7 / 2 = 3
        // (1,2,3,4,5,6,7) - input
        // (7,6,5,4,3,2,1) - output expected

        for (int i = 0; i < s.length / 2; i++) {

            char tmp = s[s.length - i - 1]; // grabbing from right end of array

            s[s.length - i - 1] = s[i]; // grab s[i] from left end of array
            s[i] = tmp;
        }

    }
}

