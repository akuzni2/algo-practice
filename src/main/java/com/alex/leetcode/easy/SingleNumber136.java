package com.alex.leetcode.easy;

import java.util.Arrays;

public class SingleNumber136 {

    public int singleNumber(int[] nums) {
        Arrays.sort(nums);

        int theOne = 0;
        for (int i = 0; i < nums.length; i += 2) {
            int left = nums[i];
            int right = 0;

            if (i + 1 >= nums.length) {
                right = left - 1; // force numbers to not be the same to fail next check
            } else {
                right = nums[i + 1];
            }

            if (left != right) {
                theOne = left;
                break;
            }

        }

        return theOne;

    }

}
