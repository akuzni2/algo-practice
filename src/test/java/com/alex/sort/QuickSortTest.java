package com.alex.sort;

import org.junit.Test;

import java.util.Arrays;

public class QuickSortTest {

    @Test
    public void shouldSort() {

        Integer[] arr = {9, 2, 6, 4, 3, 5, 1};
        Integer[] expected = {1, 2, 3, 4, 5, 6, 9};

        QuickSort.sort(arr);

        assert (Arrays.equals(arr, expected));

    }

    @Test
    public void shouldSortAllSameArray() {

        Integer[] arr = {1, 1, 1, 1, 1};
        Integer[] expected = {1, 1, 1, 1, 1};

        QuickSort.sort(arr);

        assert (Arrays.equals(arr, expected));

    }

    @Test
    public void shouldSortOneValue() {

        Integer[] arr = {1};
        Integer[] expected = {1};

        QuickSort.sort(arr);

        assert (Arrays.equals(arr, expected));

    }

    @Test
    public void shouldSortEmpty() {

        Integer[] arr = {};
        Integer[] expected = {};

        QuickSort.sort(arr);

        assert (Arrays.equals(arr, expected));

    }

}