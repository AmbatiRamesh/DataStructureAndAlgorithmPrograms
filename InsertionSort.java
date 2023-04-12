package com.bridgelabz.dataStructureAndAlgorithmPrograms;

import java.util.Arrays;

public class InsertionSort {
    void insertionSort(int array[]) {
        int size = array.length;
        for (int i = 1; i < size; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = key;
        }
    }
    public static void main(String args[]) {
        int[] data = { 45, 17, 7, 49, 18 };
        System.out.println("Before Insertion Sort");
        System.out.println(Arrays.toString(data));
        InsertionSort sort = new InsertionSort();
        sort.insertionSort(data);
        System.out.println("After Insertion Sort");
        System.out.println(Arrays.toString(data));
    }
}
