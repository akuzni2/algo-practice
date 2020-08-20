package com.alex.sort;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class QuickSort {

    public static void sort(Integer[] array) {
        quickSort(array, 0, array.length - 1);
    }

    /**
     * Used to sort between parts of array
     *
     * @param array
     * @param leftIndex
     * @param rightIndex
     */
    public static void quickSort(Integer[] array, int leftIndex, int rightIndex) {

        if (rightIndex >= array.length) {
            log.warn("Right index invalid. Last index in array should be "
                    + (array.length - 1) + " and " + rightIndex + " was given.");
        }

        // take care of handling the base case where we have a 1 element array
        if (leftIndex >= rightIndex) {
            return;
        }

        // we will swap elements around in the array AROUND this value.
        int pivotValue = array[(leftIndex + rightIndex) / 2]; //select middle element of array randomly as pivot
        int partialSortDividingIndex = partition(array, leftIndex, rightIndex, pivotValue);
        quickSort(array, leftIndex, partialSortDividingIndex - 1);
        quickSort(array, partialSortDividingIndex, rightIndex);

    }

    /**
     * Shift elements around a pivot VALUE. When left/right pointer meet this is a dividing point X where
     * all elements on the LEFT side of X are SMALLER than pivotValue and all elements on RIGHT side of X are
     * greater than pivotValue. This creates a natural division in the array.
     *
     * @param arr
     * @param leftIndex
     * @param rightIndex
     * @param pivotValue Value in array to shift elements around
     * @return index of the natural dividing point in the array where elements on LEFT side are smaller than pivotValue
     * and elements on RIGHT are greater than pivotValue.
     */
    private static int partition(Integer[] arr, int leftIndex, int rightIndex, int pivotValue) {

        while (leftIndex <= rightIndex) {

            // search for value in LEFT side of array that is BIGGER than pivot. Stop when we find it.
            while (arr[leftIndex] < pivotValue) {
                leftIndex++;
            }

            //search for value in RIGHT side of array that is SMALLER than pivot. Stop when we find it.
            while (arr[rightIndex] > pivotValue) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                swap(arr, leftIndex, rightIndex);
                leftIndex++;
                rightIndex--;
            }

        }

        return leftIndex;
    }

    public static void swap(Integer[] array, int left, int right) {
        int temp = array[right];
        array[right] = array[left];
        array[left] = temp;
    }


}
