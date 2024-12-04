package searchsort;

import java.util.Arrays;

public class InsertionSort {
    /**
     * Sort the array arr using insertion sort algorithm.
     */
    public static void sort(int[] arr) {
        
        System.out.println(Arrays.toString(arr));

        for(int i = 1; i < arr.length; i++)
        {
            int curNumber = arr[i];

            int curIndex = i-1;

            while(curIndex >= 0 && arr[curIndex] > curNumber)
            {
                arr[curIndex + 1] = arr[curIndex];
                curIndex--;
            }

            arr[curIndex + 1] = curNumber;
            System.out.println(Arrays.toString(arr));
        }

    }
}
