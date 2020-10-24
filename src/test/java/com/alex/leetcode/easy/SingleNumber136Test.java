package com.alex.leetcode.easy;

import junit.framework.TestCase;

public class SingleNumber136Test extends TestCase {

    public void testSingleNumber() {

        SingleNumber136 singleNumber136 = new SingleNumber136();

        int num = singleNumber136.singleNumber(new int[]{4, 1, 2, 1, 2});

        assertEquals(4, num);

    }
}