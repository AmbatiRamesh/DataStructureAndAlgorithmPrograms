package com.bridgelabz.dataStructureAndAlgorithmPrograms;
import java.util.Arrays;

public class BubbleSort {
    void bubbleSort(int array[]) {
        int size = array.length;
        for (int i = 0; i < size - 1; i++)
            for (int j = 0; j < size - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }
    public static void main(String args[]) {
        int[] data = { 45, 7, 100, 333, 18 };
        System.out.println("Before Sorting");
        System.out.println(Arrays.toString(data));
        BubbleSort sort = new BubbleSort();
        sort.bubbleSort(data);
        System.out.println("Sorted Array in Ascending Order:");
        System.out.println(Arrays.toString(data));
    }
}
